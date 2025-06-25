public class var_args {

    public static int sum(int x,int ...arr) {
        int result = x;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("the sum of 3 and 4 is :"+ sum(1,8));
        System.out.println("the sum of 3 and 4 and 5  is :"+ sum(3,4,5));
        System.out.println("the sum of 3 and 4 and 5 and 6 is :"+sum(3,4,5,6));
    }
}
