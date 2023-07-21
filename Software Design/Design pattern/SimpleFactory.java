/**
 * 简单工厂模式
 * 缺点：不易拓展
 */

package com.sd;

public class SimpleFactory {
    public static void main(String[] args){
        Product productA = Factory.createProduct("A");
        productA.info();

        Product productB = Factory.createProduct("B");
        productB.info();

        Product productC = Factory.createProduct("C");
    }
}

//工厂
class Factory{
    public static Product createProduct(String type){
        Product product = null;
        switch (type){
            case "A":
                product = new ProductA();
                break;
            case "B":
                product = new ProductB();
                break;
            default:
                System.out.println("没有" + type + "类型的产品!");
                break;
        }
        return product;
    }
}

//抽象产品
abstract class Product{
    public abstract void info();
}

//具体产品 A、B
class ProductA extends Product{
    @Override
    public void info() {
        System.out.println("产品A的信息:A");
    }
}

class ProductB extends Product{
    @Override
    public void info() {
        System.out.println("产品B的信息:B");
    }
}
