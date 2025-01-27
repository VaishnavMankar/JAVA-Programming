public class Function_4_2 {
    public static void main(String[] args) {
        String personalised = myGreet("Vaishnav Mankar");
        System.out.println(personalised);
    }
    static String myGreet(String name){
        String massege = "Hello " + name;
        return massege;
    }
}
