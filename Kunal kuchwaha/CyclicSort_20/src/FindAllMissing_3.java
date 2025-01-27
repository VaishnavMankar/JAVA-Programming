//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
//448. Find all the numbers Disappeared in an arrays
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class FindAllMissing_3 {
    public static void main(String[] args) {
       int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> missingNumbers = findDisappearedNumbers(arr);
        System.out.println("Missing numbers: " + missingNumbers);
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct); // Added semicolon and parentheses
            } else {
                i++;
            }
        }
        //just find missing numbers
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index+1){
                ans.add(index + 1);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
