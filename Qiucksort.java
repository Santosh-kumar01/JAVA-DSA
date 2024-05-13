public class Qiucksort {
    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void Qiucksort(int arr[], int si, int ei){
        if(si >=ei){
            return;
        }
        //last element
        int pIdex = partition(arr,si,ei);
        Qiucksort(arr,si,pIdex-1);
        Qiucksort(arr,pIdex+1,ei);
    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si - 1; // to make place smaller then pivot

        for(int j= si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
            
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }
    i++;
    int temp = pivot;
    arr[ei] = arr[i];
    arr[i] = temp;
    return i;
}
    public static void main(String[] args) {
        int arr[] = {6,3,8,5,6,3,8,1,-4,-7,-2};
        Qiucksort(arr,0,arr.length-1);
        printArr(arr);
    }
    
}
