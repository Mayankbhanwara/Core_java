import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        System.out.println("enter the subject number");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the marks of english :");
        int english =sc.nextInt();
       System.out.print("enter the marks of hindi :");
       int hindi =sc.nextInt();
        System.out.print("enter the marks of maths :");
        int maths =sc.nextInt();
        int sum = english + hindi + maths ;
        System.out.println("total of all the subjects marks :" + sum );
        float percent = sum/300f;
        float percentage = percent * 100;
        System.out.println("student percenatage is :" + percentage );

    }
}
