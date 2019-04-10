package com.jiweikeji.test;

public class testDay01 {
    public static void main(String[] args) {
        System.out.println("积微科技测试第一天,测试成功.");

        int area = getArea(50, 10);
        System.out.println("我算出来的面积是:"+area);
        System.out.println("第二种方式是直接调用的方式,也可以实现."+getArea(10,20));

    }


    public static int getArea(int weight, int height) {
        //实现方法的功能主体,下面的一个大括号爆红是因为没有return,可以先写一个return防止爆红.

        int area = weight * height;
        //retuen = weight * height;这种直接输出也可以.
        /*多行注释.*/
        return area;
    }

}
