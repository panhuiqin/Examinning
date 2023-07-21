/**
 * 工厂方法模式
 */
package com.sd;

public class FactoryMethod {
    public static void main(String[] args){
        Factory factoryA = new FactoryA();
        Product productA = factoryA.createProduct();
        productA.info();

        Factory factoryB = new FactoryB();
        Product productB1 = factoryB.createProduct();
        productB1.info();

    }
}

//工厂
//接口的方法都是抽象方法
interface Factory{
    public Product createProduct();
}

class FactoryA implements Factory{
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}

class FactoryB implements Factory{
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}

//实现一个接口必须要实现接口里的所有方法
//继承抽象类可以选择实现类里的方法
interface Product{
    public void info();
}

class ProductA implements Product{
    @Override
    public void info() {
        System.out.println("产品A的信息:A");
    }
}

class ProductB implements Product{
    @Override
    public void info() {
        System.out.println("产品B的信息:B");
    }
}
