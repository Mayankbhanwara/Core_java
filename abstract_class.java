package com.company;

abstract class profile{
    public profile(){
        System.out.println("main ek constructor hu");
    }
    public void joy(){
        System.out.println("good person");
    }
    abstract public void greet();
    abstract public void greet1();
}

class data extends profile{
    @Override
    public void greet() {
        System.out.println("good morning");
    }

    @Override
    public void greet1() {
        System.out.println("jai jinendra");
    }
}
public class abstract_class {
    public static void main(String[] args) {
   data d = new data();
d.greet();
d.greet1();
    }
}
