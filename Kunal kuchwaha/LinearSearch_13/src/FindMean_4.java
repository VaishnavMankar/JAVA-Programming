public class FindMean_4 {
    public static void main(String[] args) {
        int[] arr = {23,34,45,67,89,-8,3};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
/*
public class EX {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,-66,7};
        System.out.println(min(num));
    }

    static int min(int[] num){
        int ans = num[0];
        for(int i : num){
            if(i < ans){
                ans = i;
            }
        }
        return ans;
    }
}

*/