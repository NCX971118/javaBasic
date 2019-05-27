package com.neuedu.test;

public class bubble052701 {
    public static void main(String[] args) {
        int[] a = { 11 ,33 ,54 , 24 , 35 , 76 , 90 ,65};
        for (int i = 0 ; i < a.length-1 ; i++){
            for (int j = 0 ; j < a.length-1-i ; j++){
                if(a[ j ] > a[ j + 1 ]){
                    int s = 0 ;
                    s = a[ j ] ;
                    a[ j ] = a[ j + 1 ] ;
                    a[ j + 1 ] = s ;
                }
            }
        }
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(a[ i ]+" ");
        }

    }
}
