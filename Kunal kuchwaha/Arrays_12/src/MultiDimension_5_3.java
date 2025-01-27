import java.util.Scanner;
import java.util.Arrays;

public class MultiDimension_5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);//number of rows input

        for( int row = 0; row < arr.length; row++){
            //for each col for every row
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
