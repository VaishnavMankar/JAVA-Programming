import java.util.Scanner;

public class Divisor_15_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        printDivisor(a);
    }
    static void printDivisor(int n) {
        int i = 0;
        for(i = 1; i*i <= n; i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }                                   //O(root n)
        for(; i>= 1; i--){
            if(n%i == 0 && i != n/i){
                System.out.println(n/i);
            }
        }                                   //O(root n)
    }
}
//O(root n)