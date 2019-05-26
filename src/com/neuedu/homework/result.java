package com.neuedu.homework;

import java.util.Scanner;

public class result {
    /*利用条件运算符的嵌套来完成此题：
    学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下 的用C表示。*/
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int result = s.nextInt();
        if (result >= 90){
            System.out.println("该同学的学习成绩是："+"A");
        }else if (result >= 60 && result<90){
            System.out.println("该同学的学习成绩是："+"B");
        }else if (result < 60){
            System.out.println("该同学的学习成绩是："+"C");
        }

    }
}
