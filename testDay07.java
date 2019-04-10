package com.jiweikeji.test;

public class testDay07 {
    public static void main(String[] args) {

        char daXie = 'A';
        char xiaoXie = 'a';

        for (int i = 0; i < 26; i++) {
            System.out.print(daXie);
            System.out.print(xiaoXie);
            daXie++;
            xiaoXie++;
        }
        System.out.println();

        /*for (int i = 0; i < 26; i++) {
            System.out.print(xiaoXie);
            xiaoXie++;
        }*/


    }
}
