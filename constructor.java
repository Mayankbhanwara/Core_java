package com.company;
import java.util.Scanner;

class myemployee{
   private int id ;
     private String name;
     int Salary;
     int Age;

    public myemployee(){
        id = 123;
        name ="mayank bhanwara";
    }
    public myemployee(int salary,int age){
        Salary = salary;
        Age =age;
    }


    public void setname(String n){
        this.name = n;
    }
    public String getname(){
        return name;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId() {
        return id;
    }
    public void setSalary(int i){
        this.Salary = i;
    }
    public int getSalary() {
        return Salary;
    }
    public void setAge(int i){
        this.Age= i;
    }
    public int getAge() {
        return Age;
    }

}
public class constructor {
    public static void main(String[] args) {
        myemployee me =new myemployee();
        myemployee me1 =new myemployee(30000,34);
     me.setname("mayank");
     me.setId(456);
        System.out.println(me.getname());
        System.out.println(me.getId());
        System.out.println(me1.getAge());
        System.out.println(me1.getSalary());



    }}
