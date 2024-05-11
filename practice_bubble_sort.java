public class practice_bubble_sort {
    public static void practicebubblesort(int arr[]){
        for(int turn = 0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static  void main(int arr[]){
        for(int i = 0 ; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        System.out.println();
        practicebubblesort(arr);
        bubble_sort.printArr(arr);
    }
}
