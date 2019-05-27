package com.neuedu.test;

public class student052706 {
    String sname ;
    String sno ;
    int sheight ;
    int strong ;
    public void setSheight(int sheight1){
        if( sheight1 <= 0 ){
            System.out.print("请输入合理的身高"+"\n");
        }else{
            System.out.print("身高合理"+"\n");
            sheight = sheight1 ;
        }
    }

    public void setStrong(int strong1){
        int st = strong1 / 2 + 100;
        if(st > sheight){
            System.out.println("亲，你可能只是吃的多了点哟，要注意保持好身材！！！");
            strong = strong1 ;
        }else if(st == sheight){
            System.out.println("亲是最棒的，身材刚刚好！！！");
            strong = strong1 ;
        }else if(st < sheight){
            System.out.println("亲，你最近是劳累了吧，要注意身体！！！");
            strong = strong1 ;
        }
    }

    public void student(){

        System.out.println("学生" + sname + ";学号" + sno + ";身高" + sheight + "cm;体重" + strong + "斤");
    }
}
