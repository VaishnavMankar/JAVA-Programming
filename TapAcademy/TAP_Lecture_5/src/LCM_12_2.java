import java.util.Scanner;

public class LCM_12_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(findLcm(a,b));
    }
    static int findLcm (int a, int b){
        return (a*b)/euclidGCD(a,b);
    }
    static int euclidGCD(int a, int b){
        while (a != 0 && b != 0){
            if(a > b){
                a = a%b;
            }else{
                b = b%a;
            }
        }
        if(a != 0) {
            return a;
        }else{
            return b;
        }
    }
}
