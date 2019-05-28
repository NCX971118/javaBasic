package com.neuedu.homework.May25_27;

public class thereSum {
    /*计算 1~200 之间所有 3 的倍数之和。*/
    public static void main(String[] args) {
        int i = 3 ,thereSum = 0;
        while (i <200){
            if(i % 3 == 0 ) {
                thereSum += i;
            }
            i ++ ;
        }
        System.out.println("3的倍数和为：" + thereSum);
    }
}
