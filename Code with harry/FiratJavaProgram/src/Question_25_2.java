//Write a program to sum first n even number using while loop
public class Question_25_2 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 4;
        for(int i =0; i < n; i++) {
            sum = sum + (2 * i);
        }
        System.out.print("Sum of even number is: ");
        System.out.println(sum);
        //first 4 even number are - 0  2 4 6
    }
}
