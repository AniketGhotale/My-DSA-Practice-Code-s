public class Selectionsort {
    
    public static void selectionsort(int arr[]){

        for(int i=0; i<arr.length; i++){
            int minpos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[minpos]){
                    minpos = j;
                }
            }

            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){
        int arr[] = {5,2,4,1,3,7,6};
        selectionsort(arr);
    }
}
