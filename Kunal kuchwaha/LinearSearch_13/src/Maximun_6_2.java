public class Maximun_6_2 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2},
                {3,4,5},
                {6,7,8,9},
                {11,22,}
        };
        System.out.println(max(arr));
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;// we use min statement because we will start with min and then will come to the maximum
        for (int[] ints : arr) {
            for (int element: ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
