public class MethodOverloading_32_2 {
    static void foo(){
        System.out.println("Good morning bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning " + a + " brp!");
    }
    static void foo(int a,int b){
        System.out.println("Good Morning " + a + " brp!");
        System.out.println("Good Morning " + b + " brp!");
    }

    public static void main(String[] args) {
        foo();
        foo(400);
        foo(300,433);
    }
}
