public class PrintArrays_6 {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(" ");
        }
    }
}
/* public class EX {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int[][] arr = {
                {1,2,3,4},
                {43,43,21,45},
                {9,7,6}
        };

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}

*/