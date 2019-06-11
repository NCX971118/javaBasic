package com.neuedu.homework.May25_26;

import java.util.Scanner;

public class year {
    /*判断一个年份是平年还是闰年*/
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        if(year % 4 == 0 && year % 100 != 0 || year%400 == 0){
            System.out.println(year+"年是闰年");
        }else{
            System.out.println(year+"年是平年");
        }
    }
}
