import java.util.Scanner;

public class TrailingZero_10_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(alpha(n));
    }
    static int alpha(int n){
        int rec = 0;
        int powOfFive = 5;
        while(n >= powOfFive){
            rec = rec + (n/powOfFive);
            powOfFive = powOfFive*5;
        }
        return rec;
    }
}