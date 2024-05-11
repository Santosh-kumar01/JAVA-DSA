//RECURTION(BASICS)
 // Q.1

public class SolutionRecurtionQ1{
    public static void alloccurance(int arr[], int key, int i){
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.print(i+ " ");
        }
        alloccurance(arr, key, i+1);

    }


    //q.2
    
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        alloccurance(arr, key, 0);
        System.out.println();
    }

}