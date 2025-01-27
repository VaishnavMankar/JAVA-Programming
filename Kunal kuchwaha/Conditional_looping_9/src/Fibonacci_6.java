import java.util.Scanner;
//Find the nth fibonacci number.
public class Fibonacci_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }

}
// 0,1,1,2,3,5,8,13,21,34,