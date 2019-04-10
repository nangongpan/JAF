package com.jiweikeji.test;

/**
 * @author 南宫盼
 */
public class testDay04 {

    //弄一个简单的九九乘法表,花了十分钟回想以前学过的知识点.xx弄出来了.只不过有点瑕疵,不太好看.想办法弄个能把纵列对其的程序,弄弄.
    //最后为了好看,还为了一个小的算法研究了半天.终于成功了.
    public static void main(String[] args) throws InterruptedException {
        System.out.println("田春节加油");
        for (int j = 0; j < 10; j++) {
            for (int i = 1; i <= j; i++) {
                //方法一:利用判断逻辑来实现美观列表
                if (i == 2 && j == 3) {
                    System.out.print(i + "X" + j + "=" + i * j + "  ");
                } else if (i == 2 && j == 4) {
                    System.out.print(i + "X" + j + "=" + i * j + "  ");
                } else {
                    System.out.print(i + "X" + j + "=" + i * j + " ");
                }

                //方法二:利用\t这种转义方式来说实现同等效果.可以百度一下原因.\t制表位，顾名思义就是对对齐方便做成表格.
                //造成对不齐的原因就是个数字占一位,而十位数占领两位,所以才出现了这种分隔拉长的现象.
                //制表符的作用就是为了防止这种代码对不齐的现象.它这里的\t就是自动空了三格.但是用制表符有一个bug,如果你是不是九九乘法表,而是14乘法表就出现问题了.
                /*位空空空位空空空位空空空位空空空位空空空位空空空位空空空
                  1和5还有9...这些就是制表位，按了tab后自然就会对其到1、5、9这些格子*/
                //System.out.print(i + "X" + j + "=" + i * j + "\t");
                //System.out.print("  *");
                //Thread.sleep(300);//睡眠0.3秒。1000毫秒就是一分钟.
            }
            System.out.println();

        }

    }
}
