//https://leetcode.com/problems/set-mismatch/description/
//645. SetMismatch

public class SetMismatch_6 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        int[] result = findErrorNums(arr);
        System.out.println("Duplicate: " + result[0] + ", Missing: " + result[1]);
    }
    public static int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] -1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct); // Added semicolon and parentheses
            } else {
                i++;
            }
        }
        for(int index = 0;index < arr.length; index++){
            if(arr[index] != index + 1){
                return new int[] {arr[index], index+1};
            }
        }
        return new int[]{-1,-1};
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
