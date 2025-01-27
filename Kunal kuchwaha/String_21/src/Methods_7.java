import java.util.Arrays;

public class Methods_7 {
    public static void main(String[] args) {
        String name = "Vaishnav Mankar";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toCharArray());
        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('n'));
        System.out.println("    Vaishnav    ".strip());

        String name1 = "Hello entire world It's me";
        System.out.println(Arrays.toString(name1.split(" ")));
    }
}
