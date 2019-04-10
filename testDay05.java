package com.jiweikeji.test;

/*测试随机点名器的功能*/

import java.util.Random;

/**
 * @author Hupan-PC 南宫盼
 * 1.存储所有学生姓名
 * 2预览所以学生的姓名,遍历数组.
 * 3.随机数作为索引,在数组中寻找元素.
 */
public class testDay05 {
    public static void main(String[] args) {
        //自己手动敲一个这样的随机点名的功能吧.首先第一步先来的一个随机的字符串数组,里面全是学生的姓名.
        //先定义一个数组.创建数组的方式我都忘了,有两种初始化,一般用动态初始化的方式比较多,因为规定了长度.用new即可实现创建.
        String[] names = new String[10];
        /*接下来就可以开始方法调用了,1先存储学生姓名的方法,2遍历出学生姓名数组的方法,先一个个排出来,最后利用索引来实现随机学生姓名的方法.*/

        //1
        addStudent(names);
        //2
        lookStudent(names);
        //3(巧妙滴把随机的数字变成了随机的字符串.)(因为java中api只提供了随机数字random这个api,并没有提供随机的字符串的方法,所以这巧妙的转换了一下.)
        String name = randomStudent(names);
        System.out.println();
        System.out.println("最后随机选出的学生姓名是:"+name);


    }


    //首先方法一:添加学生.
    //方法参数:数组
    //返回值:无(void)(因为这个方法不需要返回值,只需要有一个添加学生的动作即可,主方法中也不需要调用这个方法的返回值,所以才说不需要返回值.)
    public static void addStudent(String[] names) {
        names[0] = "周杰伦";
        names[1] = "张韶涵";
        names[2] = "张含韵";
        names[3] = "捷克隽逸";
        names[4] = "古力娜扎";
        names[5] = "迪丽热巴";
        names[6] = "邓超";
        names[7] = "郑凯";
        names[8] = "Baby";
        names[9] = "胡歌";

        //这个方法一调用就表明调用成功.
    }

    //方法二:为了预览所有的学生,所以需要遍历数组.
    //参数列表:数组
    //返回值:还是void
    public static void lookStudent(String[] names) {
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
            //这一步执行后也成功了.
        }

    }

    //方法三:随机每一位学生.
    //参数列表:数组
    //返回值:String(因为需要返回一个学生的姓名.)
    public static String randomStudent(String[] names) {
        Random random = new Random();
        int index = random.nextInt(names.length);

        //然后就是巧妙的把这个随机出现的0到9的数字作为索引装入数组中,从而随机获取了这个数组中的一个随机字符串,也就是随机的学生姓名.
        return names[index];
    }

}
