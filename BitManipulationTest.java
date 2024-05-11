public class BitManipulationTest {
   /* public static void main(String[] args){
        int x = 3, y = 4;
        System.out.println("Before swap: x = " + x + " and y = "+ y);
        x = x^y;
        y = x^y;
        x=x^y;
        System.out.println("after swap: x = " + x + " and y = " + y);
    }*/

    // replacement
   /*public static void main(String[] args) {
       int x = 6;
       System.out.println(x + " + " + 1   + " is " + -~x);
       x = -4;
       System.out.println(x + " + " + 1 + " is " + -~x);
       x = 0;
       System.out.println(x + " + " + 1 + " is " + -~x);
   }*/
    public static void main(String[] args) {
// Convert uppercase character to lowercase
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char)(ch | ' '));
// prints abcdefghijklmnopqrstuvwxyz
        }
    }
}
