import java.util.Scanner;
import java.util.Arrays;

public class Main_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        arr[0] = 20;
        arr[1] = 34;
        arr[2] = 43;
        arr[3] = 45;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}

/*
import java.util.Arrays;

public class EX {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
    }
}

 */