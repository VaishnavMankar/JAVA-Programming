import java.util.Scanner;

public class SumOfDigit_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(sun(a));
    }
    static int sun(int n){
        if(n == 0){
            return 0;
        }
        return sun(n/10) + n%10;
    }
}
