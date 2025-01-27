import java.util.Scanner;
public class Question_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name");
//        String name = sc.nextLine();
//        System.out.println("Hello " + name + " have a great day");
        // the statement bellow will check weather the value entered is valid or not
        System.out.println("Enter your number");
        System.out.println(sc.hasNextInt());
    }
}