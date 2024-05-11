public class practice_selection_sort {
    public static void praticeselectionsort(int arr[]){
        for(int i = 0; i< arr.length;i++){
            int minPos = i;
            for(int j = i+1; j< arr.length; j++){
                if(arr[minPos] < arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }
    public static void main(string[] args){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        System.out.println();
        praticeselectionsort(arr);
        bubble_sort.printArr(arr);
    }
}
