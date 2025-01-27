public class MethodOverloding_32_1 {
    static  void change(int [] arr){
        arr[0] = 98;
    }

    public static void main(String[] args) {
        int [] marks = {43,55,54,65,35};
        change(marks);
        System.out.println("The value off x after running change is: " + marks[0]);

    }
}
