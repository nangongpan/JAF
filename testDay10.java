package com.jiweikeji.test;

//开始今天的重点:冒泡排序
public class testDay10 {
    public static void main(String[] args) {
        //虽然说算法上面会复杂一点点,相对于选择排序.但是原理都是比较大小然后换位.
        int[] arr = {-23, 18, -2, 1, 3, 55, -22, 55, 100};

        maoPao(arr);
        print(arr);
    }

    public static void maoPao(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {


            for (int j = 0; j < arr.length - i - 1; j++) {
                //System.out.print(arr[j]+" ");
                //同样定义一个if判断
                if (arr[j] > arr[j + 1]) {
                    int tem = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tem;


                }


            }
        }

    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            /*for (int num: arr) {
                System.out.print(num+"   ");
            }*/
        }

    }

}
