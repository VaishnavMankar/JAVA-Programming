public class RBS__8_2 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 1;
        System.out.println(search(arr,target));
    }
    static int search(int[] nums, int target){
        int pivot = findPivotWithDuplicates(nums);

        //if you dont have a pivot, it means the array is not rotated
        if(pivot == -1){
            //just do normal binary search
            return binarysearch(nums,target,0,nums.length-1);
        }
        //if pivot is found, you have found 2 asc sorted arrays
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarysearch(nums,target,0,pivot-1);
        }
        return binarysearch(nums,target,pivot+1, nums.length-1);
    }
    static int binarysearch(int[] arr, int target,int start, int end){
        while(start <= end){
            //find the middle element
            //int mid = (start + end)/2; might be possible thar (start + end) might exide the integer range
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid-1;
            }
            //if element at middle,start,end are equal then just skip the duplicate
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                //skip the duplicate
                //note: what if the start element at start and end were the pivot??
                //check if start is pivot
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                //check whether end is pivot
                if(arr[end] < arr[end -1]){
                    return end - 1;
                }
                end--;
            }
            //left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return - 1;
    }
}
