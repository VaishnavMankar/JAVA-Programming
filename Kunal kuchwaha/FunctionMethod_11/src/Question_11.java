//find weather the number is prime or not

import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
       // boolean ans = isPrime(n);
        //System.out.println(ans);
        System.out.println(isPrime(n));
    }
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while(c * c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return c * c > n;
        /*
        we can also write this as
        if(c*c > n){
           return true;
           }
           return false;
         */
    }

}
/*
public class EX {
    public static void main(String[] args) {
        System.out.println(isPrime(115));
    }
    static boolean isPrime(int n){
        if( n <= 1){
            return false;
        }
        int c = 2;
        while( c < n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}

 */