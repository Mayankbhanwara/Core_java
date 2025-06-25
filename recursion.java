import java.util.Scanner;
public class recursion {

    static int factorial(int i){
        if(i==0 || i==1){
            return 1;
        }
        else{
            return i * factorial(i-1);
        }
    }

    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int i = sc.nextInt();
      System.out.println(factorial(i));
//        int i=5;
//        System.out.println(factorial(i));
    }
}
