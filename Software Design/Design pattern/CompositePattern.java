package com.sd;

/**
 * 组合模式
 */

import java.util.ArrayList;
import java.util.List;

public class CompositePattern {
    // 在类中直接调用方法是不允许的，方法调用需要在方法、构造函数、静态初始化中进行
    // 父类名 对象名 = new 子类名
    public static void main(String[] args){
        AbstractFile root = new Folder("root");

        AbstractFile folderA = new Folder("folderA");
        folderA.printName();

        AbstractFile fileB = new File("fileB");
        fileB.printName();

        root.Add(folderA);
        root.Add(fileB);
    }
}

abstract class AbstractFile{
    protected String name;
    public void printName(){
        System.out.println(name);
    }

    public abstract boolean Add(AbstractFile file);
    public abstract boolean Remove(AbstractFile file);
    public abstract List<AbstractFile> getChildren();
}

class Folder extends AbstractFile{
    public List<AbstractFile> childrenList = new ArrayList<AbstractFile>();

    public Folder(String name){
        this.name = name;
    }

    @Override
    public boolean Add(AbstractFile file) {
        return childrenList.add(file);
    }

    @Override
    public boolean Remove(AbstractFile file) {
        return childrenList.remove(file);
    }

    @Override
    public List<AbstractFile> getChildren() {
        return childrenList;
    }
}

class File extends  AbstractFile{
    public File(String name){
        this.name = name;
    }

    @Override
    public boolean Add(AbstractFile file) {
        return false;
    }

    @Override
    public boolean Remove(AbstractFile file) {
        return false;
    }

    @Override
    public List<AbstractFile> getChildren() {
        return null;
    }
}
