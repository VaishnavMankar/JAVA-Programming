import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        arr[0] = 20;
        arr[1] = 34;
        arr[2] = 43;
        arr[3] = 45;

        //System.out.println(arr[1]);
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
//        for(int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }                                             //this is another method to print the array
        for (int j : arr) {
            System.out.println(j);
        }

    }
}