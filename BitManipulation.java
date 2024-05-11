import org.w3c.dom.ls.LSOutput;

public class BitManipulation {
    //AND
    /*public static void main(String[] args) {

        System.out.println((5 & 6));
    }*/
    //OR
   // public static void main(String[] args) {

        //System.out.println((5 | 6));
        //1's complement
        //System.out.println((~0));
       // System.out.println((5<<2)); // left shift
       // System.out.println((6>>1)); // right shift


    //check if a number is  odd and even .
   /* public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
        System.out.println("even number");
    } else{
        System.out.println("odd number");

    }
}
public static void main(String args[]){
    oddOrEven(3);
    oddOrEven(11);
    oddOrEven(14);
    }*/

    //

    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String args[]){
        System.out.println(getIthBit(10,2));
    }
}



