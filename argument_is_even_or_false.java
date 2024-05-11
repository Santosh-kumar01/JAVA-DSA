import java.util.Scanner;

public class argument_is_even_or_false {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("enter an integer: ");
        num = sc.nextInt();

        if(isEven(num)){
            System.out.println("number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
    public static boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
