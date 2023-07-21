/**
 * 单例模式
 */
package com.sd;

public class SingletonPattern {
    public static void main(String[] args){
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1.getNum());
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2.getNum());
    }
}

class Singleton{
    private int num = 2022;

    public void setNum(int num){
        this.num = num;
    }

    public int getNum(){
        return num;
    }

    private static Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
//        静态方法只能访问静态成员变量
        return instance;
    }
}