package com.neuedu.homework.May28.test;

import com.neuedu.homework.May28.natrue.student;

import java.util.Scanner;

public class tsetStudent {

    public static void main(String[] args) {
        student stu = new student();
        Scanner s = new Scanner(System.in) ;
        System.out.print("请输入学号:");
        String sno = s.next() ;
        System.out.print("请输入姓名:");
        String sname = s.next() ;
        System.out.print("请输入第一门成绩：");
        int result1 = s.nextInt() ;
        System.out.print("请输入第二门成绩：");
        int result2 = s.nextInt() ;
        System.out.print("请输入第三门成绩：");
        int result3 = s.nextInt() ;
        stu.setSno( sno ) ;
        stu.setSname(sname);
        stu.setResult(result1 , result2 , result3);
        System.out.println(stu);
    }
}
