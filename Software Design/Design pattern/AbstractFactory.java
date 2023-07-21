/**
 * 抽象工厂模式
 */
package com.sd;

public class AbstractFactory {
    public static void main(String[] args){
        Factory factoryA = new FactoryA();
        Product productA = factoryA.createProduct();
        productA.info();

        Factory factoryB = new FactoryB();
        Product productB = factoryB.createProduct();
        productB.info();
    }
}

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