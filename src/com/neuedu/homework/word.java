package com.neuedu.homework;

import java.util.Scanner;

public class word {
    /*输入一个字符，判断它是否为小写字母，如果是，将它转换成大写字母，否则，不转换*/
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        char number  = (char) num ;//int和char之间的类型值差
        char a = 'a', z = 'z' , A = 'A' , Z = 'Z';
        if(number <=122 && number >= 97){
            char nu = (char)(number - a);
            char word = (char)(A + nu);
            System.out.println("他的大写字母为：" + word);
        }else {
            System.out.println("对不起，超出范围，请重新输入！");
        }
    }
}
