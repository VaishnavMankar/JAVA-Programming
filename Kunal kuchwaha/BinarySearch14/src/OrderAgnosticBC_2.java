public class OrderAgnosticBC_2 {
    public static void main(String[] args) {
        int[] arr = {-18,-15,-8,-2,0,2,4,5,6,16,33,44};
        int target = 33;
        int ans = orderagnostic(arr,target);
        System.out.println(ans);
    }
    static int orderagnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        //find weather the array is sorted in ascending or descending
//        boolean isAsc;
//        if (arr[start] < arr[end]){
//            isAsc = true;
//        } else {
//            isAsc = false;
//        }
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            //find the middle element
            //int mid = (start + end)/2; might be possible thar (start + end) might exide the integer range
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
