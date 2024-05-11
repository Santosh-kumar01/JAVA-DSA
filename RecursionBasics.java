public class RecursionBasics {



    // decureasing
    // public static void printDec(int n ){
    //     if(n == 1){
    //         System.out.println(n);
    //         return;
    //     }
    //     System.out.println(n+ " ");
    //     printDec(n-1);
    // }

    // public static void main(String[] args) {
    //     int n = 10;
    //     printDec(n);
   // }





   //INCREASING
    public static void printInc(int n ){
        if(n == 1){
            System.out.println(  n );
            return;
        }
        printInc( n - 1 );
        System.out.println(  n  + "  ");
        
    }



    //factorial number
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }



    //sum of natural number

    // public static int CalcSum(int n){
    //     if(n==1){
    //         return 1;
    //     }
    //     int Snm1 = CalcSum(n-1);
    //     int Sn = n + Snm1;
    //     return Sn;
        
   // }


    //calculate nth term in fibonacci
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    //firstoccurence element

    public static boolean isSorted(int arr[], int i){
        if( i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static int firstOccurence(int arr[], int key, int i ){
        if(i == arr.length) {
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }

//lastoccurance
public static int lastoccurance(int arr[], int key, int i){
    if( i == arr.length){
        return -1;
    }
    int isFound = lastoccurance(arr, key, i+1);
    if(isFound == -1 && arr[i] == key){
        return i;
    }
    return isFound;
}

//pow(x^n)
  
public static int power(int x, int n){
    if(n == 0){
        return 1;
    }
    return x * power(x, n-1);
}
public static int tilingProblem(int n){ 
    if(n == 0 || n == 1){
        return 1;
    }   // 2 * n floor size

    //kaam
    //vertical choice
    int fnm1 = tilingProblem(n-1);

    // horizonatal choice
    int fnm2 = tilingProblem(n-2);

    int totways = fnm1 + fnm2;
    return totways;

}
//important:- remove duplication in a string "appnnacollage"
public static void removeDuplicates(String str, int idx, StringBuilder newstr, boolean map[]){
    if(idx == str.length()){
        System.out.println(newstr);
        return;
    }
    char currChar = str.charAt(idx);
    if(map[currChar-'a'] == true){
        //duplicate
        removeDuplicates(str, idx+1, newstr, map);

    }else{
        map[currChar-'a'] = true;
        removeDuplicates(str, idx+1, newstr.append(currChar), map);
    }

}
// friends pairing problems(impt)
public static int friendsPairing(int n){
    if(n == 1 || n == 2){
        return n;
    }
    //choice
    //single
    // int fnm1 = friendsPairing(n-1);

    // //pair
    // int fnm2 = friendsPairing(n-2);
    // int pairWays = (n-1) * fnm2;

    // //toways
    // int totways = fnm1 + pairWays;
    // return totways;
// another methods
    return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
}


// Binary String Problem( ask:- paytm)

public static void  printBinaryStrings(int n, int lastplace, String str){
    //basecase
    if(n == 0 ){
        System.out.println(str);
        return;
    }
    // working
    // if ((lastplace == 0)) {
    //     //str += "0";
    //     printBinaryString(n-1, 0, str.append("0")); 
    //     printBinaryString(n-1, 1, str.append("1"));
        
    // }else{
    //     printBinaryString(n-1, 0, str.append("0"));

    // }

    printBinaryStrings(n-1,0 , str+"0");
    if(lastplace == 0){
        printBinaryStrings(n-1, 1, str+"1");
    }
}

public static void main(String[] args) {
    printBinaryStrings(3, 0, "");

    //System.out.println(tilingProblem(4));
    //String str = "appnnacollage";
    //removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    
}

    // public static void  main(String[] args) {
    //     // int arr[] = {8,3,6,9,5,10,2,5,3};
    //     //int arr[] = {5,5,5,5};
    //     System.out.println(power(2, 10));
    // }
}

    // public static void main(String[] args) {
    //     int n = 25;
    //     System.out.println(fib(23));
    //     //System.out.println(fib(3));
    //     System.out.println(fib(24));
    //     System.out.println(fib(25));
    //     System.out.println(fib(26));
    //     System.out.println(fib(27));
    // }



    // another method for increasing

    //  public static void printInc(int n ){
    //     if(n == 10){
    //         System.out.println(n);
    //         return;
    //     }
    //     System.out.println(n+ " ");
    //     printInc(n+1);
    // }

    // public static void main(String[] args) {
    //     int n = 1;
    //     printInc(n);
    // }
    
    

