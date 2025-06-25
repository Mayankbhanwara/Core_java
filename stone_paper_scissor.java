import java.util.Scanner;
import java.util.Random;

public class stone_paper_scissor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter 0 for stone , 1 for paper and 2 for scissor :");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput=random.nextInt(3);

        if(userInput==computerInput){
            System.out.println("draw");
        } else if (userInput==0 && computerInput==1 || userInput==1 && computerInput==2 || userInput==2&&computerInput==0 )
            {
                System.out.println("you win");
            }
        else{
            System.out.println("computer win");
        }
        System.out.println("computer choice :" + computerInput);
    }
}
