package com.neuedu.homework.May25_27;

public class num {
    /*有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？*/
    public static void main(String[] args) {
      int s = 0 ;
      for (int i = 1 ; i <= 4 ; i++){
          for( int j = 1 ;j <= 4 ; j ++){
              for (int n = 1 ; n <= 4 ; n++){
                  if (i != j && i != n && j != n){
                      System.out.print( i * 100 + j * 10 + n + " ");
                      s++;
                  }
              }
          }
      }
        System.out.println("总个数是"+s+"个");
    }
}
