import java.util.Scanner;

public class BitManipulation_EX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        binaryToDecimal(a);
    }
    static void binaryToDecimal(int n){
        int t = n;
        int d = 0;
        int i = 0;
        while(t>0){
            int r = t%10;
            t = t/10;
            d = d + r*(int)Math.pow(2,i++);
        }
        System.out.println(d);
    }
}
