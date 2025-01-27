//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
//744. Find Smallest Letter Greater Than Target
public class SmallestLetter_3 {
    public static void main(String[] args) {
        char[] arr = {'c','f','j','k'};
        char target = 'c';
        char ans = nextGreatestChar(arr,target);
        System.out.println(ans);
    }
    //return the index
    //smallest number >= target   c f g  j
    static char nextGreatestChar(char[] letters, char target){

        int start = 0;
        int end = letters.length - 1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if (target < letters[mid]){             //we cant change the sequence of if else statement.
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }

        }
        return letters[start % letters.length];
    }
}
