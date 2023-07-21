/**
 * 构建者模式
 */
package com.sd;

import java.util.*;

public class BuilderFile {
    public static void main(String[] args){
        Director director = new Director();

        Builder builder_A = new Builder_A();
        director.Construct(builder_A);
        Product product_A = builder_A.getProduct();
        product_A.show();

        Builder builder_B = new Builder_B();
        director.Construct(builder_B);
        Product product_B = builder_B.getProduct();
        product_B.show();
    }
}

class Director{
//    根据对应生成器创建对应产品
    public void Construct(Builder builder){
        builder.BuilderPart();
    }
}

abstract class Builder{
    public abstract void BuilderPart();
    public abstract Product getProduct();
}

class Builder_A extends Builder{
    Product product = new Product();

    @Override
    public void BuilderPart() {
        product.Add("零件A");
        product.Add("零件B");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}

class Builder_B extends Builder{
    Product product = new Product();

    @Override
    public void BuilderPart() {
        product.Add("零件C");
        product.Add("零件D");
        product.Add("零件E");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}

class Product{
    List<String> parts = new ArrayList<String>();

    public void Add(String part){
        parts.add(part);
    }

    public void show(){
        System.out.print("产品的组成:");
        for(String s : parts)
            System.out.print(s + " ");
        System.out.println("");
    }
}
