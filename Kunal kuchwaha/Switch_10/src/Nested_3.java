import java.util.Scanner;

public class Nested_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your EmployeeID: ");
        int empId = sc.nextInt();
        String department = sc.next();

        switch(empId){
            case 1 :
                System.out.println("Vaishnav Mankar");
                break;
            case 2 :
                System.out.println("Nayan Lohakare");
                break;
            case 3:
                System.out.println("Employee no 3");
                switch(department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department");
                }
                break;
            default:
                System.out.println("Enter current employee ID");
        }
    }
}
