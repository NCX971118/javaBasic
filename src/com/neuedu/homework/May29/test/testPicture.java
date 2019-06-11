package com.neuedu.homework.May29.test;

import com.neuedu.homework.May29.means.picture;

import java.util.Scanner;

public class testPicture {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入数字：");
        int w = s.nextInt();
        picture p = new picture();
        p.Yareas(w);p.Zareas(w);
        System.out.println(p);

    }
}
