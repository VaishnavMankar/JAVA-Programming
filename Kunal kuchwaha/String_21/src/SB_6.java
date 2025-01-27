//this method is much more faster than the earlier one

public class SB_6 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < 26; i++){
            char ch = (char)('a' + i);
            str.append(ch);
        }
        System.out.println(str.toString());

        str.deleteCharAt(0);
        System.out.println(str);

        str.reverse();
        System.out.println(str);
    }
}
