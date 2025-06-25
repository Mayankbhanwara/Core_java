public class method_2 {
//    static void telljoke(){
//        System.out.println("my name is mayank bhanwara");
//    }
//    public static void main(String[] args) {
//        telljoke();
//    }


//    int sum(int a,int b){
//         return a+ b;
//    }
//    public static void main(String[] args) {
//        method_2 s = new method_2();
//        int c =  s.sum(3,4);
//        System.out.println(c);
//            }

//    static void change(int[] arr){
//        arr[0]=98;
//    }
//    public static void main(String[] args) {
//        int [] arr ={52,97,96,65,77,45};
//        change(arr);
//        System.out.println("give the value of x:"+ arr[0]);
//    }

    int number(){
      return 0;
    }
    int number(int a,int b){
        return a+b;
    }
    int number(int a, int b , int c){
        return a*b*c;
    }
    public static void main(String[] args) {
        method_2 sc = new method_2();
       int c =sc.number();
        System.out.println(c);
    }

}
