public class BitMask_20_3 {
    public static void main(String[] args) {
        int n = 36;
        int i = 5;

        int tmask = 1 << i;

        System.out.println(n ^ tmask);
    }
}
