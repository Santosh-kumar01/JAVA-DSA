import java.util.Scanner;

public class average_of_three_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the first number: ");
        double x = sc.nextDouble();
        System.out.println("input the second number: ");
        double y = sc.nextDouble();
        System.out.println("input the third number: ");
        double z = sc.nextDouble();
        System.out.println("the average value is" + average(x, y, z)+"\n");
    }

    public static double average(double x, double y, double z) {
        return(x+y+z) / 3;

    }
}
