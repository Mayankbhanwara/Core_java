package com.company;

interface myphoto{
    void takephoto();
    void takevideo();
    private void greet(){
        System.out.println("good morning.");
    }
    default void take4kvideo(){
        greet();
        System.out.println(" this save the 4k video.....");
    }
}
interface myrecords{
    String [] getrecords();
    void connecttorecord(String network);
}
class MYcellphone {
    void callnumber(int number) {
        System.out.println("calling :" + number);
    }

    void pickcall() {
        System.out.println("connnecting...");
    }
}
    class Mysmartphone extends MYcellphone implements myphoto, myrecords {
        @Override
        public void takephoto() {
            System.out.println("taking snap");
        }

        public void takevideo() {
            System.out.println("take snap");
        }
//         public void take4kvideo(){
//             System.out.println("take snap");
//         }
        @Override
        public String[] getrecords() {
            System.out.println("getting list of network");
            String[] networklist = {"mayank","aagam","nitin"};
            return networklist;
        }

        @Override
        public void connecttorecord(String network) {
            System.out.println("connecting to :" + network);
        }
    }

    public class default_method {
        public static void main(String[] args) {
            Mysmartphone ms = new Mysmartphone();
            String[] ar =ms.getrecords();
            ms.take4kvideo();
            for(String item:ar){
                System.out.println(item);
            }
        }
    }