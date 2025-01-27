//https://leetcode.com/problems/find-all-duplicates-in-an-array/submissions/1215696957/
//442. Find all Duplicate in an Array.

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class FindAllDuplicates_5 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }
    public static List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] -1 ;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct); // Added semicolon and parentheses
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index+1){
                ans.add(arr[index]);
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
