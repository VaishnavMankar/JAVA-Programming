public class EX {
    public static void main(String[] args) {
        int[][] ans = {
                {1,2,3,4,5},
                {23,45,53,4},
                {23,54,667,87}
                //{23,5,5,5}
        };
        System.out.println(maximum(ans));
    }
    static int maximum(int[][] arr){
        int ans = Integer.MIN_VALUE;
        for(int per = 0; per < arr.length;per++){
            int sum = 0;
            for(int aco = 0;aco<arr[per].length;aco++){
                sum = sum + arr[per][aco];
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}

