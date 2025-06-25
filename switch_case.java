import  java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        int age;
        System.out.println("enter the age :");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
//        if(age>56){
//            System.out.println("u are experienced");
//        } else if (age>46) {
//            System.out.println("you are semi-experienced");
//        } else if (age>36) {
//            System.out.println("you are semi semi experienced");
//        }
//        else{
//            System.out.println("you are not");
//        }
        switch(age){
            case 20:
                System.out.println("you are going to be adult");
                break;
            case 25:
                System.out.println("you are being an adult");
                break;
            case 29:
                System.out.println("you are an adult");
                break;
            default:
                System.out.println("you are not an adult");
        }
    }
}
