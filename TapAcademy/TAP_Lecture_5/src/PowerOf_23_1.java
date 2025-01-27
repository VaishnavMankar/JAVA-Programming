import java.util.Scanner;

public class PowerOf_23_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        System.out.println(powOf2(c));
    }
    static boolean powOf2(int n){
        if(n == 0){
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
