package com.neuedu.test;

import java.util.Scanner;

public class student052705 {
    public static void main(String[] args) {
        student052706 stu = new student052706();
        Scanner s = new Scanner(System.in);
        System.out.print("请输入姓名");
        String sname = s.next();
        System.out.print("请输入学号");
        String sno = s.next();
        System.out.print("请输入身高");
        int h = s.nextInt();
        System.out.print("请输入体重");
        int str = s.nextInt();
        stu.sname = sname;
        stu.sno = sno;
        stu.setSheight(h);
        stu.setStrong(str);
        stu.student();

    }
}
