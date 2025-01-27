import java.util.Scanner;

public class ReverseAString_37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverse(s,"",s.length()-1));
    }
    static String reverse(String s, String r, int i){
        if(i < 0){
            return r;
        }
        return reverse(s,r+s.charAt(i),i-1);
    }
}
