public class OddEven_1 {
    public static void main(String[] args) {
        int n = 69;
        System.out.println(isOdd(n));
    }
    static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}
