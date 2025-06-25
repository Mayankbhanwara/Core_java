import java.util.Scanner;
public class first {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//       System.out.println("enter your name :");
//       String ch = sc.next();
//        System.out.println("hello "+ ch +" you have a good day");


        System.out.print("enter the kilometer :");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        System.out.println("change the km in miles :");
        float miles = a*0.62f;
        System.out.println("km to miles are :" + miles);
    }
}
