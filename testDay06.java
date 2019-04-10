package com.jiweikeji.test;

import java.util.ArrayList;

/*ArrayList集合的使用.*/
public class testDay06 {
    public static void main(String[] args) {

        //先定一个集合.add方法是添加,get是获取其中元素,点size是获取长度.
        ArrayList<String> list = new ArrayList<>();
        list.add("周杰伦");
        list.add("张韶涵");
        list.add("林俊杰");
        list.add("王力宏");

        int size = list.size();
        String s = list.get(1);
        System.out.println("第二个位置的元素是:" + s);
        System.out.println("这个集合的长度为:" + size);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
