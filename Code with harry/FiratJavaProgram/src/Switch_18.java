import java.util.Scanner;

public class Switch_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter your age ");
        age = sc.nextInt();

        if (age > 56 ){
            System.out.println("you are experienced!");
        }else if(age > 46 ){
            System.out.println("You are semi-experience");
        }else if(age > 36){
            System.out.println("You are semi-semi-experience");
        }else {
            System.out.println("You are no experience");
        }
    }

}
