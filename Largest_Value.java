import java.sql.SQLOutput;

public class Largest_Value {

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is :" + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,5,7,8};
        System.out.println("largest value is :" + getLargest(numbers));

    }
}
