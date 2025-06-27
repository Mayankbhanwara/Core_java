package com.company;

interface BICYCLE{
    int b=45;
     void applybrake(int decrement);
     void speedup(int increment);
}
interface carride {
    void car1();
    void car2();
}

class avoncycle implements BICYCLE,carride{
    void blowhorn(){
        System.out.println("pee pee poo poo");
    }
    public void applybrake(int decrement){
        System.out.println("applying brake");
    }
    public void speedup(int increment){
        System.out.println("speed increase");
}
public void car1(){
    System.out.println("this is very fast");
}
    @Override
    public void car2() {
        System.out.println("this is very low speed");
    }
}

public class interface_class {
    public static void main(String[] args) {
avoncycle a = new avoncycle();
a.applybrake(3);
        System.out.println(a.b);
        a.car1();
        a.car2();
    }
}
