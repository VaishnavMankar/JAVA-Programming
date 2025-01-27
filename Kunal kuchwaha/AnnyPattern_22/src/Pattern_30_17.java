public class Pattern_30_17 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int row = 1; row <= 2 * n; row++){

            int c = row > n ? 2 * n - row : row;

            for(int space = 0; space < n-c; space++){ //This command is for spaces
                System.out.print("  ");
            }
            for(int col = c; col >= 1; col--){ //This command is for bigger to smaller
                System.out.print(col+ " ");
            }
            for(int col = 2; col <= c; col++){ //This command is for continuous the array from smaller to bigger
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }
}
