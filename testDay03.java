package com.jiweikeji.test;

import java.io.IOException;

public class testDay03 {
    static final int X = 3;
    static final int Y = 3;
    static int tar[][] = new int[X][Y];
    static int BX, BY;
    static int step = 0;

    static void init() {
        /*正常排序插入*/
        int index = 0;
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                tar[i][j] = index++;
            }
        }
        /*打乱排序*/
        for (int i = 0; i < tar.length; i++) {
            for (int j = 0; j < tar[i].length; j++) {
                int temp = tar[i][j];
                int randomX, randomY;
                randomX = (int) (Math.random() * X);
                randomY = (int) (Math.random() * tar[randomX].length);
                tar[i][j] = tar[randomX][randomY];
                tar[randomX][randomY] = temp;
            }
        }
    }

    static void outPrint() {
        boolean isok = true;

        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                if (tar[i][j] == 0) {
                    System.out.print("	[囧]");
                    BX = i;
                    BY = j;
                } else {
                    if (tar[i][j] != (i * (Y) + j + 1)) {
                        isok = false;
                    }
                    System.out.print("	[" + (tar[i][j] < 10 ? " " + tar[i][j] : tar[i][j]) + "]");
                }
            }
            System.out.println();
        }
        if (isok) {
            System.out.println("恭喜获胜！步数： " + step);
        } else {
            System.out.println("go on! 步数： " + step);
        }
    }

    static void change(int dir) {
        switch (dir) {
            case 115://S 下
                if (BX != 0) {
                    tar[BX][BY] = tar[BX - 1][BY];
                    tar[BX - 1][BY] = 0;
                    BX--;
                    step++;
                    outPrint();
                }
                break;
            case 100://D 右
                if (BY != 0) {
                    tar[BX][BY] = tar[BX][BY - 1];
                    tar[BX][BY - 1] = 0;
                    BY--;
                    step++;
                    outPrint();
                }
                break;
            case 119://W 上
                if (BX != X - 1) {
                    tar[BX][BY] = tar[BX + 1][BY];
                    tar[BX + 1][BY] = 0;
                    BX++;
                    step++;
                    outPrint();
                }
                break;
            case 97://A 左
                if (BY != Y - 1) {
                    tar[BX][BY] = tar[BX][BY + 1];
                    tar[BX][BY + 1] = 0;
                    BY++;
                    step++;
                    outPrint();
                }
                break;

            default:
                break;
        }
    }

    public static void main(String[] args) throws IOException {

        init();
        outPrint();
        while (true) {
            int read = System.in.read();
            change(read);
        }
    }


}
