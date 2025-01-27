import java.util.Scanner;

public class Lect_8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
    static int factorial(int n){
        int rec = 1;
        for(int i = 1; i <= n; i++){
            rec *= i;
        }
        return rec;
    }
}
