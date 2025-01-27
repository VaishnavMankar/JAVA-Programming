public class Maximum_6 {
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
    int max = Integer.MIN_VALUE;   //this line is for comparing the values with others
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
