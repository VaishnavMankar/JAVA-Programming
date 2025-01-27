import java.util.Scanner;

public class RightMostBit_21_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(posOfRmsb(a));
    }
    static int posOfRmsb(int n){
        return (int)(Math.log10(n ^ (n & (n-1))) / Math.log10(2))+1;
    }
}
