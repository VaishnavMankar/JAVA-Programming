import java.util.Scanner;

public class PrintPrime_14_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        printprime(a);
    }
    static boolean isPrime(int n){
        if(n == 1){
            return false;
        }if(n == 2 || n == 3){
            return true;
        }if(n%2 == 0 || n%3 == 0){
            return false;
        }for(int i = 5; i*i <= n; i = i+6){
            if(n%i == 0 || n%(i+2) == 0){
                return false;
            }
        }
        return true;
    }
    static void printprime(int n){
        for(int i = 2;i <= n; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
