public class SolutionRecurtionQ2 {
    static String digits[] = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGTH", "NINE"};




    public static void printDigit(int number){
        if(number == 0){
            return;
        }
        int lastDigit = number%10;
        printDigit( number/10);
        System.out.print(digits[lastDigit]+" ");

    }

    public static void main(String[] args) {
        printDigit(1947);
        System.out.println();
    }



    
}

