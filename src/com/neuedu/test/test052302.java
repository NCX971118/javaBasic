package com.neuedu.test;

public class test052302 {
    public static void main(String[] args) {
        int a = 2 ,b = 8;
        if(a > b){
            System.out.println(a);
        }else{
            a++;
            System.out.println(a);
        }
        int x = 34 ;
        do{
            b = x + 3 ;
            x++;
            System.out.println("b的值"+b+" x的值"+x);
        }while (x < 37) ;
        float f = 3.465f ;
        for ( int i = 0 ; f < 5 ; f = f + 1){
            i = (int)f % 10 ;
            System.out.println( "i的值为"+i );
        }
    }
}
