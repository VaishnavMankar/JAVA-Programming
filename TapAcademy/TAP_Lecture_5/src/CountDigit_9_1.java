import java.util.Scanner;

public class CountDigit_9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n));
    }
    static int count(int n){
        int con = 0;
        while(n > 0) {
            n = n / 10;
            con++;
        }
        return con;
    }
}
