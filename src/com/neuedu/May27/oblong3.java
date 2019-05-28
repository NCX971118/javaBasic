package com.neuedu.May27;

import java.util.Scanner;

public class oblong3 {
    /*1 定义长方形类，含：特征：宽、高（整型）；方法：求周长、面积；*/
    int width ;
    public void zhouchang(int hig){
        int zhouchang =( width +hig) * 2;
        System.out.println("周长为" + zhouchang);
    }

    public  void mianji(int hig){
        int mianji = width * hig ;
        System.out.println("面积为" + mianji);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入宽度");
        int w = s.nextInt();
        oblong3 o = new oblong3();
        o.width = w ;
        o.zhouchang(6);
        o.mianji(6);
    }
}
