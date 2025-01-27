public class Ex {
    public static void main(String[] args) {
        int[] arr = {-18,-13,-8,0,2,4,6,8,10,12,16,18,24,32,44};
        int target = 32;
        System.out.println(BinearySearch(arr,target));
    }
    static int BinearySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid =  start + ( end - start)/2;

            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
