package com.company;

class discriminator{
    public int a;

    public int getA() {
        return a;
    }

    discriminator(int a){
        this.a=a;
    }
    public int returnone(){
        return 1;
    }
        }
class Doclass extends discriminator{
    Doclass(int c){
        super(c);
        System.out.println("mai ek constructor hu");
    }
}
public class constructor_with_default {
    public static void main(String[] args) {

//        discriminator d = new discriminator(8);
//        System.out.println(d.getA());
//        System.out.println(d.returnone());

        Doclass m = new Doclass(9);
    }
}
