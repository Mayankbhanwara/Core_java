package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file {
    private static Object file2;

    public static void main(String[] args) {
//        File  myfile = new File("file2.txt");
//        try{
//            myfile.createNewFile();
//        }
//        catch( IOException e){
//            System.out.println("unable to create this file ");
//            e.printStackTrace();
//        }
//
//        // code are written in the txt file
//        try{
//            FileWriter fileWriter = new FileWriter("file2.txt");
//            fileWriter.write(" this is our first jaava course progrem");
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        File myfile = new File("file2.txt");
//        try {
//            Scanner sc = new Scanner(myfile);
//            while(sc.hasNextLine()){
//                String line = sc.nextLine();
//                System.out.println(line);
//            }
//            sc.close();
//        }catch(FileNotFoundException e){
//            e.printStackTrace();
//        }

        File myfile = new File("file2.txt");
        if(myfile.delete()){
            System.out.println("my file was deleted :" + myfile.getName());
        }
        else{
            System.out.println("some error occured while deleting the file");
        }

    }
}
