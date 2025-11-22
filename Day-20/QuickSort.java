public class QuickSort {
    
    public static void Quicksort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int ptid = partition(arr,si,ei);
        Quicksort(arr,si,ptid-1);
        Quicksort(arr,ptid+1,ei);
    }


    public static int partition(int arr[], int si, int ei){

        int pivot = arr[ei];
        int i = si-1;

        for(int j=si; j<ei; j++){

            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[ei] = temp;

        return i;
    }
    public static void main(String args[]){
        int arr[] = {6,3,9,8,2,5};
        Quicksort(arr,0,arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
