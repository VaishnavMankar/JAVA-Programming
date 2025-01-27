import java.util.Scanner;
//the addition of cube of individual number 153 = 1+125+27 = 153
public class Question_12 {
    public static void main(String[] args) {
       Scanner sc  = new Scanner(System.in);
       int n = sc.nextInt();
        System.out.println(isArmstrong(n));
    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }
        if(sum == original){   // instead we can write || return sum == original; ||
            return true;
        }
        return false;
    }
}
