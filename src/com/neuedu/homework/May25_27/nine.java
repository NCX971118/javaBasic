package com.neuedu.homework.May25_27;

import java.util.Scanner;

public class nine {
    /*一个整数的各位数字之和能被 9 整除，
    则该数也能被 9 整除。编程验证给定的整数能否被 9 整除*/
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        if (number % 9 == 0) {
            System.out.println("该数能被9整除");
        } else {
            System.out.println("该数不能被9整除");
        }
    }
}