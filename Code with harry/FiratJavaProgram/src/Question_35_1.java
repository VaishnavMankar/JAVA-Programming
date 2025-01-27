public class Question_35_1 {
    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d * %d = %d\n", n, i, n * i);
        }
    }

    public static void main(String[] args) {
        multiplication(5);
    }
}
