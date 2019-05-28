package com.neuedu.homework.May27;

import java.util.Scanner;

public class round {
    /*定义圆类，它有一个变量radius(半径)。从键盘输入数据，将半径传递给radius，
    编程计算并输出圆的周长和面积（确保输入的数据不为负数）。并对其进行测试*/

    int radius ;
    public void radius(int r){
        if (r < 0){
            System.out.println("请输入正确的半径数值");
        }
    }
    public void zhouchang(int rad){
        int zhouchang = rad * 2 * (int)Math.PI ;
        System.out.println("周长为" + zhouchang);
    }
    public void mianji(int rad){
        int mianji = (int)(Math.PI * Math.pow(rad ,2 ));
        System.out.println("面积为" + mianji);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入半径");
        int r = s.nextInt();
        round round = new round();
        round.radius(r);
        round.zhouchang(r);
        round.mianji(r);
    }
}
