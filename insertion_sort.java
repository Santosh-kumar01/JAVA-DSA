import java.lang.reflect.Array;
import java.util.*;
public class insertion_sort {
    public static void insertionsort(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > arr[curr]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1]= curr;
        }
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        //insertionsort(arr);
        Arrays.sort(arr,0,2);
        bubble_sort.printArr(arr);
    }
}
