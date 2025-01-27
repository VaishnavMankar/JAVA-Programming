import java.util.Scanner;

public class MultiDimension_5{
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
        for( int row = 0; row < arr.length; row++){               //for( int row = 0; row < arr.length; row++){
            //for each col for every row                          //System.out.println(Arrays.toString(arr[row]);
            for(int col = 0; col < arr[row].length; col++){       //}
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(" ");
        }
    }
}
