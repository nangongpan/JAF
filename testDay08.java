package com.jiweikeji.test;

//数组逆序问题:数组逆序不是反向遍历.
public class testDay08 {
    public static void main(String[] args) {
        //反向遍历只是反向遍历,0号索引位置的元素没有改变,而逆序就等于是把0号索引的位置和最后一位索引位置的元素交互了,其他元素也是一样的道理.
        int[] arr = {1, 2, 3, 4};
        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.println(arr[i]);
        }
        System.out.println("0索引处的元素还是:"+arr[0]);

    }
}
