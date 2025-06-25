package com.company;

class employee{
    String name;
    int age;
}
class manager extends employee{
    int salary;
    int birth;
}
public class class_1 {
    public static void main(String[] args) {
        manager m = new manager();
        m.name="mayank";
        m.age = 20;
        System.out.println(m.name);
        System.out.println(m.age);
    }
}
