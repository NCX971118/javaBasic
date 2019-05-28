package com.neuedu.homework.May25_27;

public class factorial {
    /*计算9！*/
    public static void main(String[] args) {
        int factorial = 9 , sum = 1 ;
        for(int i = 1 ;i <= factorial ;i++){
            sum = sum*i ;
        }
        System.out.println(factorial+"的阶乘是："+sum);
    }
}
