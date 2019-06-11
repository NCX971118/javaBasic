package com.neuedu.homework.May28.means;

/*有五个学生，每个学生有3门课的成绩，从键盘输入以上数据
（包括学生号，姓名，三门课成绩），计算出平均成绩*/

public class student {
    private String sno ;
    private String sname ;
    private int result1 ;
    private int result2 ;
    private int result3 ;
    private int result ;

    public void setSno(String sno){
        this.sno = sno ;
    }

    public void setSname(String sname){
        this.sname = sname ;
    }

    public void setResult1(int result1){
        this.result1 = result1 ;
    }

    public void setResult2(int result2){
        this.result2 = result2 ;
    }

    public void setResult3(int result3){
        this.result3 = result3 ;
    }

    public void setResult(int result1 , int result2 , int result3){
        this.getSno();this.getSname();
        this.result =( result1 + result2 + result3 ) / 3 ;

    }

    public String getSno(){
        return sno;
    }

    public String getSname(){
        return sname;
    }

    public int getResult1(){
        return result1;
    }

    public int getResult2(){
        return result2;
    }

    public int getResult3(){
        return result3;
    }

    public int getResult(){
        return result;
    }

    public String toString(){
        return "学号：" + sno + ";姓名：" + sname + "平均成绩：" + result ;
    }

}
