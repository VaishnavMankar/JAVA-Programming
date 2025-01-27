public class BitMask_20_2 {
    public static void main(String[] args) {
        int n = 36;
        int i = 5;

        int offMask = ~(1 << i);

        System.out.println(n & offMask);
    }
}
