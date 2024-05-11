import java.util.Scanner;
public class ask_the_user_enter {
    public static void main(String[] args) {
        System.out.println("what is your name ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("hello " + name + " have a good day! ");
    }
}
