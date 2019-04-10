package com.jiweikeji.test;

/**
 * 选择排序问题.
 *
 * @author Hupan-PC 南宫盼
 */
public class testDay09 {
    public static void main(String[] args) {
        //开始排序问题,先是顺序,后期再弄反向排序.
        //先定义一个数组,进行初始化才有参数可以使用.
        int[] arr = {100, 0, 1, 5, 8, -1, -5, 5, 10, 10, 23, 53};
        //先用一下排序方法
        selectSord(arr);
        //再用一下遍历方法.
        print(arr);


    }


    //来一个方法调用.
    /*参数列表:int[]arr   返回值:void*/
    public static void selectSord(int[] arr) {
        int i = 0;
        int j = 0;
        for (i = 0; i < arr.length - 1; i++) {
            //i代表第一位元素的索引.
            for (j = i + 1; j < arr.length; j++) {
                //j代表第二位元素的索引.
                //然后开始将两个元素进行比较大小,从而进行排序.
                //System.out.print("*");用这个可以做一个倒直角三角形.
                /*还是一样开始交换位置把数值小的元素放在前面.*/

                if (arr[i] > arr[j]) {
                    int tem = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tem;

                }
                //System.out.print(arr[j] + " ");

            }

            //System.out.print(arr[j] + " ");

        }
        //System.out.print(arr[i] + " ");
    }


    //来一个遍历方法.
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
