package com.neuedu.May27;

import java.util.Scanner;

public class count {
    /*定义一个计算器类，包括加、减、乘、除运算。并对其进行测试*/
    public void add(int num3 , int num4){
        int sum = num3 + num4 ;
        System.out.println(num3 + "和" + num4 + "的和为" + sum);
    }

    public void cut(int num3 , int num4){
        int sum = num3 - num4 ;
        System.out.println(num3 + "和" + num4 + "的差为" + sum);
    }

    public void ride(int num3 , int num4){
        int sum = num3 * num4 ;
        System.out.println(num3 + "和" + num4 + "的积为" + sum);
    }

    public void divide(int num3 , int num4){
        int sum = num3 / num4 ;
        System.out.println(num3 + "和" + num4 + "的商为" + sum);
    }

    public static void main(String[] args) {
        count count = new count();
        Scanner s = new Scanner(System.in);
        System.out.print("请选择运算方式：1、加法 2、减法 3、乘法 4、除法");
        int x = s.nextInt();
        if( x > 4 || x <1){
            System.out.println("请选择正确选项");
        }
        System.out.print("请输入第一个数");
        int m = s.nextInt();
        System.out.print("请输入第二个数");
        int n = s.nextInt();
        switch (x){
            case 1:
                count.add( m , n );
                break;
            case 2:
                count.cut( m , n );
                break;
            case 3:
                count.ride( m , n );
                break;
            case 4:
                count.divide( m , n );
                break;
            default:
                System.out.print("请选择正确选项");
        }
    }
}
