public class HeapSort {
    //MinHeap = Desecnding order And MaxHeap = Assecnding Order
    public static void heapify(int arr[], int i, int size){

        int left = (2*i)+1;
        int right = (2*i)+2;
        int minidx = i;

        if(left < size && arr[left] < arr[minidx]){
            minidx = left;
        }

        if(right < size && arr[right] < arr[minidx]){
            minidx = right;
        }

        if(minidx != i){

            int temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;

            heapify(arr, minidx, size);
        }
    }
    public static void heapsort(int arr[]) {

        int n = arr.length;
        //step1 sort non-leaf nodes
        for(int i=n/2; i>=0; i--){
            heapify(arr,i,n);
        }

        for(int i=n-1; i>=0; i--){
            
            //swap 1st and last
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;


            //againg sort from  1st to last-1
            heapify(arr,0,i);
        }
    }
    public static void main(String args[]){
        int arr[] = {4,2,3,1};
        heapsort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
