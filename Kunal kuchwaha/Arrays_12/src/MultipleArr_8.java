import java.util.ArrayList;
import java.util.Scanner;

public class MultipleArr_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}
/*
public class EX {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            arr.add(new ArrayList<>());
            for(int j = 0; j < 3; j++){
                arr.get(i).add(sc.nextInt());
            }
        }
        for(ArrayList<Integer> a : arr){
            System.out.println(a);
        }
    }
}

 */
