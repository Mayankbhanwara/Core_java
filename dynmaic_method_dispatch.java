package com.company;

class phone{
    public void phone1() {
        System.out.println("this is my nokia phone");
    }
    public void on(){
        System.out.println("this is my lava phone");
    }
}
class smartphone extends phone{
    public void smartphone1(){
        System.out.println("this is the smartphone");
    }
    public void on(){
        System.out.println("this is my iphone");
    }
        }

public class dynmaic_method_dispatch {
    public static void main(String[] args) {
        phone d = new smartphone(); // yes it allow and it also has run time polymorphism
        //smartphone s = new phone(); // this is not allowed
        d.phone1();
        d.on(); // this is runtime polymorphism and dynamic_method_dispatch
      //  d.smartphone1();// not run
    }
}
