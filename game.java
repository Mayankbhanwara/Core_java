package com.company;
import java.util.Scanner;
import java.util.Random;

class mygame{
    public int number;
    public int inputnumber;
    public int guessnumber=0;

    public int getGuessnumber() {
        return guessnumber;
    }
    public void setGuessnumber(int guessnumber) {
        this.guessnumber = guessnumber;
    }

    mygame(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeuserinput(){
        System.out.println("guess the number :");
        Scanner sc = new Scanner(System.in);
        inputnumber =sc.nextInt();
    }
boolean iscorrect() {
    guessnumber++;
    if (inputnumber == number) {
        System.out.format("yes you guess the right,it was %d/n,you guess it in %d/n attemps", number, guessnumber);
    } else if (inputnumber > number) {
        System.out.println("guess no is high...");
    } else if (inputnumber < number) {
        System.out.println("it is to low...");
    }
    return false;
}
}
public class game{
    public static void main(String[] args) {
mygame m = new mygame();
boolean b = true;
while(!b){
    m.takeuserinput();
    b=m.iscorrect();
    System.out.println(b);
}
    }
}
