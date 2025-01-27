import java.util.Scanner;

public class Function_4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String namee = sc.nextLine();
        String personalised = myGreet(namee);
        System.out.println(personalised);
    }

    static String myGreet(String name) {
        String massege = "Hello " + name;
        return massege;
    }
}