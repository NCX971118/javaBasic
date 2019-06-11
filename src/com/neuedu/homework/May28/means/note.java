package com.neuedu.homework.May28.means;

/*定义一个笔记本类，该类有颜色（char）和cpu型号（int）两个属性。
2.1 无参和有参的两个构造方法；有参构造方法可以在创建对象的同时为每个属性赋值；
2.2 输出笔记本信息的方法 3.3 然后编写一个测试类，测试笔记本类的各个方法。*/

public class note {
    private char color ;
    private int cpu ;

    public note(){}

    public note(char color){
        this.color = color ;
    }

    public note(int cpu){
        this.cpu = cpu ;
    }

    public note(char color , int cpu){
        this.color = color ;
        this.cpu = cpu ;
    }

    public note(int cpu , char color){
        this.cpu = cpu ;
        this.color = color ;
    }

    public String toString(){
        return "笔记本的颜色是" + color + "；cpu的型号是" + cpu ;
    }
}
