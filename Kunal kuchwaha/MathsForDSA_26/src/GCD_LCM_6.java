//greatest comen factor
public class GCD_LCM_6 {
    public static void main(String[] args) {
        System.out.println(gcd(4,8));
    }
     static int gcd(int a,int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a,a);
    }
}
