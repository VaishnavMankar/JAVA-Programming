//https://leetcode.com/problems/find-the-duplicate-number/description/
//287. Find the duplicate Number

public class FindDuplicate_4 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] arr){
        int i = 0;
        while (i < arr.length) {

            if(arr[i] != i+1) {
                int correct = arr[i] -1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct); // Added semicolon and parentheses
                } else {
                    return arr[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
