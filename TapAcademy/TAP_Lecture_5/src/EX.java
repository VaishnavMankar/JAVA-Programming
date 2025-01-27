import java.util.Scanner;

public class EX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(positionOfBit(a));
    }
    static int positionOfBit(int n){
        int m = 1;
        int pos = 0;

        if(n == 0){
            return -1;
        }
        while((n & m) == 0){
            m = m << 1;
            pos++;
        }
        return pos+1;
    }
}
