import java.util.Scanner;
import java.util.ArrayList;

public class ArraysList_7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

        for(int i = 0; i < 5; i++){
            list.add(sc.nextInt());
        }
        for(int i = 0; i < 5; i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);//another way to print the entire array;
    }
}

/*  public class EX {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(3);

        for(int i = 0; i < 5; i++){
            arr.add(sc.nextInt());
        }
        for(int num : arr){
            System.out.println(num);
        }
    }
}
*/
