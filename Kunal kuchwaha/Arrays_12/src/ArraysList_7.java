import java.util.ArrayList;
//import java.util.Scanner;

public class ArraysList_7 {
    public static void main(String[] args) {
        //syntax. These are reserve key word
        ArrayList<Integer> list = new ArrayList<>(10); // the number is not mandatory

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(346);
        list.add(4634);
        list.add(143);
        list.add(45);
        list.add(544);
        list.add(453);
        list.add(543);
        list.add(56);
        list.add(45);

        System.out.println(list);
        System.out.println(list.contains(2));
        list.set(0,99);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
    }
}
