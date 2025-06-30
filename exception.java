package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public abstract class exception {
    public static void main(String[] args) {
        int [] marks =  new int [3];
        marks[0]= 7;
        marks[1]= 56;
        marks[2]= 6;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the array index :");
        int ind =sc.nextInt();

        System.out.println("enter the value you want ot divide with :");
        int number = sc.nextInt();

        try{
            System.out.println("enter the array value : "+ marks[ind]);
            System.out.println("enter the value you want to dividee with number :"+marks[ind]/number);
        }
        catch(ArithmeticException e){
            System.out.println("some  Arithemtic exception occured");
            System.out.println(e);
        }
catch(ArrayIndexOutOfBoundsException e){
            System.out.println("some aaray index out of bound exception occured");
    System.out.println(e);
        }
catch(Exception e){
            System.out.println("some exception occured");
    System.out.println(e);
        }

    }

    public abstract String getMessage();
}
