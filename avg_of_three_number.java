import java.util.Scanner;

public class avg_of_three_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int average = (A + B + C);
        System.out.println("average is : " + average);
    }
}
