import java.util.Scanner;

public class PrimeFactor_16_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        printFactor(a);
    }
    static void printFactor(int n){
        int i = 2;
        while(n>1){
            while(n%i == 0){
                System.out.println(i);
                n = n/i;
            }
            i++;
        }
    }
}
//O(n)