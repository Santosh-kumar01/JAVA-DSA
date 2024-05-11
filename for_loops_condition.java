import java.util.Scanner;

public class for_loops_condition {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();*/
        // square patter
        /*for(int i = 1; i <= 4; i++){
            System.out.println("* * * *");

        }*/
        // print reverse of a number
        /* int n = 106984899;
         while(n > 0){
             int lastDigit = n % 10;
             System.out.print(lastDigit);
             n = n / 10;
         }
        System.out.println( )*/;
        int n = 10899;
        int rev = 0;
        while( n > 0){
            int lastDigit = n % 10;
            rev = (rev*10) + lastDigit;
            n = n/10;


        }
        System.out.println(rev);
    }
}
