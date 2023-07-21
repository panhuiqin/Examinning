package com.sd;

/**
 * 装饰器模式
 */
public class DecoratorPattern {
    public static void main(String[] args){
        Person apan = new Student("apan");
        apan.Operation();
    }

}

abstract class Person{
    protected String name;

    public abstract void Operation();
}

class Student extends Person{
    public Student(String name){
        this.name = name;
    }

    @Override
    public void Operation() {
        System.out.println(name+"的职责是学习");
    }
}
