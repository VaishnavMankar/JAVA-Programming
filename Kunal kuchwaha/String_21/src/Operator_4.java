import java.util.ArrayList;

public class Operator_4 {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println('a'+3);
        System.out.println((char)('a'+3));
        System.out.println("a"+1);
        System.out.println("Vaishnav" + new ArrayList<>());
        System.out.println("Vaishnav" + new Integer(29));
        String ans = new Integer(29) +"" + new ArrayList<>();
        System.out.println(ans);
    }
}
