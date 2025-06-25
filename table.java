//public class table {
//     static void table(int n){
//         for(int i=1;i<=10;i++){
//             System.out.format("%d x %d =%d",n,i,n*i);
//         }
//     }
//    public static void main(String[] args) {
//         table(7);
//    }
//}

public class table{
    static void pattern(int  n){
        for(int i=0;i<n;i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}