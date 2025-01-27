//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
//1295. Find Numbers with Even Number of Digits
public class EvenDigits_7 {
    public static void main(String[] args) {
      int[] nums = {12,345,4,6,1234};
        System.out.println(findNumber(nums));

        System.out.println(digit(12345));
        System.out.println(digit2(-23567));
    }
    static int findNumber(int[] nums){
        int count = 0;
        for(int num: nums){
            if(even(num)) {
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberOfDigits = digit(num);   //you can also write this if statement in single line
        if(numberOfDigits % 2 == 0){       // return numberOfDigits % 2 = 0;
            return true;
        }
        return false;
    }
    static int digit2(int num){ // this method is faster than the below digits method;
        if(num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num)) +1;
    }
    static int digit(int num){
        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}
