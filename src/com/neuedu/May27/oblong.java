package com.neuedu.May27;

import java.util.Scanner;

public class oblong {
    /*1 定义长方形类，含：特征：宽、高（整型）；方法：求周长、面积；*/
    public void zhouchang(int wid ,int hig){
        int zhouchang =( wid +hig ) * 2;
        System.out.println("周长为" + zhouchang);
    }

    public  void mianji(int wid , int hig){
        int mianji = wid * hig ;
        System.out.println("面积为" + mianji);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入宽度");
        int w = s.nextInt();
        System.out.print("请输入高度");
        int h = s.nextInt();
        oblong o = new oblong();
        o.zhouchang(w,h);
        o.mianji(w,h);

    }
}
