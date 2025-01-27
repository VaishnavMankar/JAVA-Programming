// another way to find maximum out of three
import java.util.Scanner;
public class Max_4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Greatest of three number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(c, Math.max(a,b));
        System.out.println(max);
    }
}
