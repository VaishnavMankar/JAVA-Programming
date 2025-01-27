import java.util.Arrays;

public class Main_118{
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[5] = 234;
        System.out.println(arr[5]);
        System.out.println(arr.length);

        int[] newArray;
        newArray = new int[]{1,2,3,4,5};
        for(int i = 0; i<newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }
        System.out.println(Arrays.toString(newArray));
    }
}
