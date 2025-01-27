public class Main_2 {
    public static void main(String[] args) {
        String name1 = "Vaishnav";
        String name2 = "Vaishnav";
        System.out.println(name1 == name2);

        String nam1 = new String("vaish");
        String nam2 = new String("vaish");
        System.out.println(nam1 == nam2);

        System.out.println(nam1.equals(nam2));
        System.out.println(nam1.charAt(0));
    }
}
