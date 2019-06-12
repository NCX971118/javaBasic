package com.neuedu.homework.May29.means;

/*
 *定义一个图形类
  创建图形 圆形 正方形 有自己的属性 例如圆形的特征 都有半径
  分别定义自己的计算面积和计算周长
  创建main方法 进行测试 创建对象 调用方法计算面积和周长
 */

public class   picture {

    private int width ;
    private double Yareas ;
    private double Zareas ;

    public picture(){
    }

    public void Yareas(int width){
        Yareas = (Math.PI * width) ;
    }
    public void Zareas(int width){
        Zareas = Math.pow(width ,2);
    }

    public String toString() {
        return "当图形为圆形的时候，面积为：" + Yareas
                + "当图形为正方形的时候，面积为："  + Zareas ;
    }
}
