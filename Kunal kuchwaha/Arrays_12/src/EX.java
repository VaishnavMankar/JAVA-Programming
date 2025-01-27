public class EX {
    public static void main(String[] args) {
      int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(maxVal(arr,2,5));
    }
    static int maxVal(int[] num,int start, int end){
        if(end < start){
            return -1;
        }
        if(num == null){
            return -1;
        }
        int max = num[start];
        for(int i = start; i <= end; i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        return max;

    }
}
