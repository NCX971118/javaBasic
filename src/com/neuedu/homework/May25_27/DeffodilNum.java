package com.neuedu.homework.May25_27;

public class DeffodilNum {
    /*打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，
     其各位数字立方和等于该数本身。例如： 153是一个"水仙花数"，
     因为153=1的三次方＋5的三次方＋3的三次方。*/
    public static void main(String[] args) {
        int sum = 0 ;
        for (int a = 1 ; a <= 9 ; a++){
            for (int b = 0 ; b <= 9 ; b++){
                for(int c = 0 ; c <= 9 ; c++){
                  sum = a*a*a + b*b*b + c*c*c ;
                  if(sum == a*100 + b*10 + c){
                      System.out.println(sum + "是水仙花数");
                  }
                }
            }
        }
    }
}
