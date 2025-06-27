package com.company;

interface sampleinterface{
    void meth1();
    void meth2();
}
interface samplechildinterface extends sampleinterface{
    void meth3();
    void meth4();
}
class myclass implements samplechildinterface{
    @Override
    public void meth1() {
        System.out.println("meth1...");
    }
    @Override
    public void meth2() {
        System.out.println("meth2....");
    }
    @Override
    public void meth3() {
        System.out.println("meth3......");
    }
    @Override
    public void meth4() {
        System.out.println("meth4.....");
    }
}
public class interface_inheritance {
    public static void main(String[] args) {
        myclass mc =new myclass();
        mc.meth1();
        mc.meth2();
        mc.meth3();
        mc.meth4();

    }
}
