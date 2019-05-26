package com.neuedu.homework;

public class num {
    /*有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？*/
    public static void main(String[] args) {
        int sum = 1 ;
        for (int i = 4 ; i > 1 ; i--){
            sum *= i ;
        }
        System.out.println("能组合成" + sum + "个三位数");

        int num1 = 1 ,num2 = 2 , num3 = 3 ,num4 = 4 ;
        /* 组合数写不出来*/
    }
}
