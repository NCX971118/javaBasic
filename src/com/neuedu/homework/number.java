package com.neuedu.homework;

import java.util.Scanner;

public class number {
    /*一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同*/
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        if( number >= 100000){
            System.out.println("！！！请输入5位数！！！");
        }
        int a = number / 10000 ;
        int b = number % 10000 / 1000 ;
        int c = number % 100 / 10 ;
        int d = number % 10;
        if( a == d ){
            if( b == c ){
                System.out.println(number + "是回文数");
            }else{
                System.out.println(number + "不是回文数");
            }
        }else{
            System.out.println(number + "不是回文数");
        }

    }
}
