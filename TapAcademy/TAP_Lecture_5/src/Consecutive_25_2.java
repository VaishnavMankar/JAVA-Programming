import java.util.Scanner;

public class Consecutive_25_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(countConsecutive(a));
    }
    static int countConsecutive(int n){
        int count = 0;
        while(n > 0){
            n = (n & (n << 1));
            count++;
        }
        return count;
    }
}
