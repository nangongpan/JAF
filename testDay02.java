package com.jiweikeji.test;

public class testDay02 {
    public static void main(String[] args) {

        System.out.println("abc");
        printJuxing();

    }

    /*利用*号打印一个矩形,也可以尝试用$打印一个矩形也可以. */

    public static void printJuxing() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("$");
            }
            System.out.println();
        }

    }

}
