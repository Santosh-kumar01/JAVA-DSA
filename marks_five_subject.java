import java.util.Scanner;

public class marks_five_subject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your physics marks:");
        int physics = scan.nextInt();
        System.out.println("enter your chemistry marks:");
        int chemistry = scan.nextInt();
        System.out.println("enter your mathematics marks: ");
        int mathematics = scan.nextInt();
        System.out.println("enter your computer marks: ");
        int computer = scan.nextInt();
        System.out.println("enter your english marks: ");
        int english = scan.nextInt();

        float percentage = ((physics + chemistry + mathematics + computer + english) / 500.0f) * 100;
        System.out.println("percentage: ");
        System.out.println(percentage);
        }
    }

