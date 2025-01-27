//to calculate the sum of the numbers occurring in the table of 8
public class Question_25_9 {
    public static void main(String[] args) {
        int n = 8;
        int sum = 0;
        for(int i = 1;i<=10;i++){
            sum += n*i;
        }
        System.out.println(sum);
    }
}
