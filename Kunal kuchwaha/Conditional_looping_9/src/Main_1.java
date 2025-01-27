public class Main_1 {
    public static void main(String[] args) {
        int salary = 10000;
        salary = 30000;
        if(salary >= 20000){
            salary += 2000;
        }
        else if (salary >= 10000){
            salary += 1000;
        }
        else {
             salary += 100;
        }
        System.out.println(salary);
    }
}
