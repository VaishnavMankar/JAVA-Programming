public class Fibonaci_33 {
    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
    static int fibo(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
}


//public class Fibo_4 {
//    public static void main(String[] args) {
//        System.out.println(fibo(5));
//    }
//    static int fibo(int n){
//        //base condition
//        if(n < 2){
//            return n;
//        }
//        return fibo(n-1) + fibo(n-2);
//    }
//
//}

