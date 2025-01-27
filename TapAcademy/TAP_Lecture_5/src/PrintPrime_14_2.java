import java.util.Scanner;

public class PrintPrime_14_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sievePrintPrime(a);
    }
    static void sievePrintPrime(int n){
        boolean[] prime = new boolean[n + 1];
        for(int i = 2; i <= n; i++){
            if(prime[i] == false){
                for(int j = i*2; j <= n; j=j+i){
                    prime[j] = true;
                }
            }
        }
        for(int i = 2; i <= n; i++){
            if(prime[i] == false){
                System.out.println(i);
            }
        }
    }
}
