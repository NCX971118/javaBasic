package com.neuedu.homework.May25_26;

public class NumSum {
    /*分别计算1-100之间的奇数和 和偶数和 */
    public static void main(String[] args) {
        int jsum = 0 , osum = 0 , sum = 0;
        for(int i = 1 ; i <= 100 ; i++){
            sum = i + sum ;
            if(i % 2 == 0){
                osum = osum + i ;
            }
            jsum = sum - osum ;
        }
        System.out.println("1-100之间的奇数和是："+jsum+"\n"+"1-100之间的偶数和是："+osum);
    }
}
