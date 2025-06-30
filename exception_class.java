package com.company;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return " i am toString()";
    }
    @Override
    public String getMessage(){
      return "i am get Message";
   }
}
public class exception_class {
    public static void main(String[] args) {
           int a;
   Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<99){
            try{
                throw new Exception();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();  // konsa error konsi line me aaya he 
                System.out.println(" finished ");
            }
            System.out.println("end");
        }
    }
}
