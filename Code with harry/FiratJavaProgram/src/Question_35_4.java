//write a function to print n^th tern of fibonacci series using recursion;
public class Question_35_4 {
    static int fib(int n){
        if(n == 1){
            return 0;
        }
        else if(n ==2){
            return 1;
        }
        // better way tto write this is
        // if(n==1 || n==2){
        //     return n-1;
        // }
        else{
         return fib(n-1) + fib(n-2);
        }
    }
    //fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    public static void main(String[] args) {
        int result = fib(6);
        System.out.println(result);
    }
}
