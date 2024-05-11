import javax.imageio.stream.ImageInputStream;
import java.util.Locale;

public class practics_set3 {
    public static void main(String[] args) {


        /*WAJP to convert a string to lowercase*/
        String name = "santosh kumar";
        name = name.toLowerCase();
        System.out.println(name);


        // WAJP TO REPLACE SPACE WITH UNDERSCORE
        String text = "To my    world";
        text = text.replace(" ", "_");
        System.out.println(text);


        //WAJP to fill in a letter template which bots like below
        String letter = "dear <|name|>, thanks a lot!";
        letter = letter.replace("<|name|>","santosh");
        System.out.println(letter);

        //WAJP to detect double and triple space in a string
        String myString = "This string contains  double and triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));


        //WAJP TO FROMAT THE FOLLOWING LETTER USING ESCAPE SEQUANCE CHARACTER
        String myLetter = "Dear santosh, \n\tThis java course is nice.\nThanks!";
        System.out.println(myLetter);
    }
}
