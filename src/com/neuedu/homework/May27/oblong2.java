package com.neuedu.homework.May27;

import java.util.Scanner;

public class oblong2 {
    /*1 定义长方形类，含：特征：宽、高（整型）；方法：求周长、面积；*/
    int width ;int hight ;
    public void zhouchang(){
        int zhouchang =( width +hight ) * 2;
        System.out.println("周长为" + zhouchang);
    }

    public  void mianji(){
        int mianji = width * hight ;
        System.out.println("面积为" + mianji);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入宽度");
        int w = s.nextInt();
        System.out.print("请输入高度");
        int h = s.nextInt();
        oblong2 o = new oblong2();
        o.width = w ;
        o.hight = h ;
    }
}
