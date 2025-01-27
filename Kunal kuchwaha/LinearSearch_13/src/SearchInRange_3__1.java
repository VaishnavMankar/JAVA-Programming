public class SearchInRange_3__1 {
        public static void main(String[] args) {
        int[] num = {1,23,45,67,99,-3,36,-24};
        int target = 99;
        System.out.println(linearSearch(num,target,1,4));
    }
    //Searching in the array: return the value if its found
    //return -1 if the value is not found
    static int linearSearch(int[] arr,int target,int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for (int index = start; index <= end; index++){
            //check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        //this line will execute if none of the return statement above have executed
        //hence the target not found
        return -1;
    }
}
