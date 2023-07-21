/**
 * 原型模式
 */
package com.sd;

public class PrototypeFile {
    public static void main(String[] args) throws CloneNotSupportedException {
        Product product1 = new Product(2022,12.12);
        System.out.println(product1.getId()+ " " + product1.getPrice());

//        自实现的Clone
//        Product product2 = (Product) product1.Clone();
        Product product2 = (Product) product1.clone();
        System.out.println(product2.getId()+ " " + product2.getPrice());
    }
}

interface Prototype{
    public Object Clone();
}

//自实现的clone方法
//class Product implements Prototype{
//java已经实现的clone方法
class Product implements Cloneable{
    private int id;
    private double price;

//    空构造方法给复制的时候使用
    public Product(){}

    public Product(int id,double price){
        this.id = id;
        this.price = price;
    }

//    私有成员变量只能通过set方法访问get方法获取
    public int getId(){
        return id;
    }

    public double getPrice(){
        return price;
    }

//    @Override
//    public Object Clone() {
//        Product object = new Product();
//        object.id = this.id;
//        object.price = this.price;
//        return object;
//    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
}
}