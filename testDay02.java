package com.jiweikeji.test;

public class testDay02 {
    public static void main(String[] args) {

        System.out.println("abc");
        printJuxing();

    }

    /*����*�Ŵ�ӡһ������,Ҳ���Գ�����$��ӡһ������Ҳ����. */

    public static void printJuxing() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("$");
            }
            System.out.println();
        }

    }

}
