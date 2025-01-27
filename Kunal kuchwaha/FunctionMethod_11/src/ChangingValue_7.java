import java.util.Arrays;

public class ChangingValue_7 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int [] num){
        num [0] = 90;
    }
}
