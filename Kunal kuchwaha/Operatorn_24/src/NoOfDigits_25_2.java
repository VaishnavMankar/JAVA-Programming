public class NoOfDigits_25_2 {
    public static void main(String[] args) {
        int n = 10;
        int b = 2;

        //int ans = (int)(Math.log(n) / Math.log(b)) + 1;
        int ans = (int)(Math.log10(n))+1;
        System.out.println(ans);
    }
}
