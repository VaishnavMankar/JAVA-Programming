import java.util.Scanner;

public class SwapEvenOddBots_26_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(swapEvenOddBot(a));
    }
    static int swapEvenOddBot(int n){
        return ( (n & 0xaaaaaaaa) >>> 1) | ((n & 0x55555555)<<1 );
    }
}
