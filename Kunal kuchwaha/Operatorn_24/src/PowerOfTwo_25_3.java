public class PowerOfTwo_25_3 {
    public static void main(String[] args) {
        int n = 8;
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
    }
}
