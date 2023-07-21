package com.sd;

/**
 * 适配器模式
 */
public class AdapterPattern {
    public static void main(String[] args){
        USB usb = new Adapter();
        usb.Request();
    }
}

//Target目标接口
class USB{
    public void Request(){
        System.out.println("USB");
    }
}

class Adapter extends USB{
    private TypeC typeC = new TypeC();
    @Override
    public void Request() {
        typeC.SpecificRequest();
    }
}

//Adaptee需要适配的接口
class TypeC{
    public void SpecificRequest(){
        System.out.println("TypeC");
    }
}
