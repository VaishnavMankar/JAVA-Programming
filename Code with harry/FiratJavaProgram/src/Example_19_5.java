import java.util.Scanner;

public class Example_19_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your website");
        String website = sc.next();

        if(website.endsWith(".org")){
            System.out.println("This is an organizational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("THis is a commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an Indian website");
        }
        else{
            System.out.println("Wrongly entered");
        }
    }
}
