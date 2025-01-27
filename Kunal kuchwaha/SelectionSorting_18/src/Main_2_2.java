import java.util.Arrays;

public class Main_2_2 {
    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2};
        selectionSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSorting(int[] arr){
        for(int i = 0; i<arr.length-1;i++){
            int smallest = i;
            for(int j = i+1; j<arr.length;j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

            for(int nums: arr){
                System.out.print(nums + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
