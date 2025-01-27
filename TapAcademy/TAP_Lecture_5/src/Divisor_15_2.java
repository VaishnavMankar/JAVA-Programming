import java.util.Scanner;

public class Divisor_15_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        printDivisor(a);
    }
    static void printDivisor(int n){
        for(int i = 1; i*i<= n; i++){
            if(n%i == 0){
                System.out.println(i);
                if(i != n/i) {
                    System.out.println(n / i);
                }
            }
        }
    }
}
