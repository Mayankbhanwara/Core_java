package com.company;

class Mythread3 implements Runnable{
    public void run(){
        System.out.println("my first thread is running");
    }
}
class Mythread4 implements Runnable{
    public void run(){
        System.out.println("my second thread is running");
    }
}
public class Thread_Runnable {
    public static void main(String[] args) {
Mythread3 bullet1 = new Mythread3();
Thread gun1 = new Thread(bullet1);
Mythread4 bullet2 =new Mythread4();
Thread gun2 = new Thread(bullet2);
gun1.start();
gun2.start();
    }
}
