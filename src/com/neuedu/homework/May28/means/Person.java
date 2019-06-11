package com.neuedu.homework.May28.means;

public class Person {
    /*定义两个类，描述如下：
4.1定义一个人类Person：
4.1.1定义一个方法sayHello()，可以向对方发出问候语“hello,my name is XXX”
4.1.2有三个属性：名字、身高、体重
4.2定义一个PersonCreate类：
4.2.1创建两个对象，分别是zhangsan，33岁，1.73；
lishi，44，1.74 5.2.2分别调用对象的sayHello()方法。*/
    public String pname ;
    public int page ;
    public double pweight ;

    public Person(String pname ,int page , double pweight){
        this.pname = pname ;
        this.page = page ;
        this.pweight = pweight ;
    }
    public void sayHello(){
        System.out.print("hello,my name is " + pname);
    }

    public void PersonCreate(){

    }
    public String toString(){
        return "姓名" + pname +";年龄" + page + "；身高" + pweight;
    }
}
