import java.util.Scanner;

public class Strings {
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        //char arr[] = {'a','b','c','d'};
       // String str = "abcd";
       // String srt2 = new String("axy");
        //Scanner sc = new Scanner(System.in);
       // String name ;
        //name = sc.nextLine();
        //System.out.println(name);

        //String fulName = "santosh kumar";
        //System.out.println(fulName.length());

        //concatenation
        //String firstName ="santosh";
       // String lastName = "kumar";
        //String fullName = firstName+ " " + lastName;
        //System.out.println(fullName);

        String firstName ="santosh ";
        String lastName = "kumar";
        String fullName = firstName+ " " + lastName;
        //System.out.println(fullName.charAt(8));
        printLetters(fullName);
    }
}
