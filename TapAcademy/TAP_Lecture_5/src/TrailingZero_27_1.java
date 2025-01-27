import java.util.Scanner;

public class TrailingZero_27_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(numberOfTZ(a));
    }
    static int numberOfTZ(int n){
        return (int)(Math.log10((n & n-1) ^ n) / Math.log10(2));   //o(1)
    }
}
