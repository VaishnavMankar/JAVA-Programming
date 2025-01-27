public class String15 {
    public static void main(String[] args) {
        //problen 1
        String name = "Vaishnav Mankar";
        name = name.toLowerCase();
        System.out.println(name);
        //System.out.println(name.toLowerCase());

        //problem 2
        String text = "To my friend";
        text = text.replace(" ","_");
        System.out.println(text);

        //problem 3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>","Vaishnav");
        System.out.println(letter);
        //System.out.println(letter.replace("<|name|>","Vaishnav"));

        //problem 4
        String line = "That's a great    work   team!";
        //System.out.println(line.indexOf("   "));
        System.out.println(line.indexOf("  "));

        //problem 5
        String newLetter = "Dear Vaishnav, \n\tThis java courrse in good.\n\tThanks!";
        System.out.println(newLetter);

    }
}
