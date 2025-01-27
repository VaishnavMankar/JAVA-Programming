import java.util.Scanner;

public class PrimeFactor_16_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        printPrime(a);
    }
    static void printPrime(int n){
        int i = 2;
        while(i*i <= n){              // root n
            while(n%i == 0){          // root n log n
                System.out.println(i);
                n = n/i;
            }
            i++;
        }
        if(n>1) {
            System.out.println(n);
        }
    }
}
// O(root n log n)