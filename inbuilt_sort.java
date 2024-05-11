import java.util.Arrays;

public class inbuilt_sort {
    public static void inbuiltsort(int arr[]){
        for(int i=1; i<arr.length; i++) {
            int current = arr[i];
            int previous = i - 1;
            while (previous >= 0 && arr[previous] > current ){
                arr[previous + 1] = arr[previous];
                previous--;

            }
            arr[previous+1] = current;
        }
    }
    public static void main(String args[]){
        int arr[] = {5, 4, 1 , 3, 2};
        Arrays.sort(arr);
        bubble_sort.printArr(arr);
    }
}
