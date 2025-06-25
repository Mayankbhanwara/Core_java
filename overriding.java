package com.company;

class a{
    public void alpha(){
        System.out.println("i am alpha");
    }
    public int beta(){
        return 3;
    }
}
class b extends a{
    public void alpha(){
        System.out.println("i am beta");
    }
}
public class overriding {
    public static void main(String[] args) {
    b bro = new b();
    bro.alpha();
    }
}
