import java.util.Scanner;

public class Consecutive_25_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(isConsecutive(a));
    }
    static boolean isConsecutive(int n){
        if((n & (n<<1)) != 0){
            return true;
        }else {
            return false;
        }
    }
}
