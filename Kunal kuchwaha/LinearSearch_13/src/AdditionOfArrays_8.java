//https://leetcode.com/problems/richest-customer-wealth/description/
//1672. Richest Customer Wealth
public class AdditionOfArrays_8 {
    public static void main(String[] args) {
      int[][] ans = {
              {1,2,3,4,5},
              {23,45,53,4},
              {23,54,667,87}
              //{23,5,5,5}
      };
        System.out.println(maximumWealth(ans));
    }
    public static int maximumWealth(int[][] accounts){
        //person = rows
        //account = colum
        int ans = Integer.MIN_VALUE;
        for(int person = 0; person < accounts.length;person++){
            //when you take a new col, take a new sum for the row
            int sum = 0;
            for(int account = 0; account <accounts[person].length;account++){
                sum += accounts[person][account];
            }
            //now we have sum of accounts of person
            //check with overall ans
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
/*
class Solution {
    public int maximumWealth(int[][] accounts) {
         //person = rows
        //account = colum
        int ans = Integer.MIN_VALUE;
        for(int person = 0; person < accounts.length;person++){
            //when you take a new col, take a new sum for the row
            int sum = 0;
            for(int account :accounts[person]){
                sum += account;
            }
            //now we have sum of accounts of person
            //check with overall ans
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}
*/