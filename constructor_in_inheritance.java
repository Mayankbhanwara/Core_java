package com.company;

class base1{
    public int x;

    base1(){
        System.out.println("i am base1 class constructor");
    }
    base1(int x){
        System.out.println("i take the value from the base class :" + x );
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class derived1 extends base1{
    public int y;

    derived1(){
        System.out.println("i am derived1 class constructor");
    }
    derived1(int x, int y){
        super(x);
        System.out.println("i take the value from the derived class :" + y);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class child extends derived1{
    public int z;
    child(){
        System.out.println(" i am child class constructor");
    }
    child(int x,int y,int z){
        super(x,y);
        System.out.println("i am overloaded child class consturctor :" + z);
    }
}

public class constructor_in_inheritance {
    public static void main(String[] args) {
//        base1 b = new base1();
//        derived1 d = new derived1();
//        derived1 d = new derived1(14,9);

        child c = new child(12,13,14);
    }
}
