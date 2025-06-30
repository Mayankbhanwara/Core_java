package com.company;

import java.sql.SQLOutput;

class mythread1 extends Thread{
    public void run(){
        int i=0;
        while(i<4000) {
            System.out.println("my thread is running");
            System.out.println("i am happy");
            i++;
        }
    }
}
class mythread2 extends Thread{
    public void run() {
        int i = 0;
        while (i < 4000) {
            System.out.println("my thread is running and fastly running");
            System.out.println("i am sad");
            i++;
        }
    }
}
public class multithreading {
    public static void main(String[] args) {
        mythread1 mt1 = new mythread1();
        mythread2 mt2 = new mythread2();
        mt1.start();
        mt2.start();

    }
}
