public class BinarySearch {

    public static int BinaryRec(int arr[], int key, int start , int end) {        
        if(start <= end ) {
        int mid = (start + end) / 2;
        
        if(arr[mid] < key) {
            start = mid +1;
            return BinaryRec(arr, key, start, end);
        }else if(arr[mid] > key) {
            end = mid - 1;
            return BinaryRec(arr, key, start, end);
        }else{
            return mid;
        }
    }
    return -1;
    }
    

    public static int BinaryS(int arr[] , int key){
        int start=0, end=arr.length-1;
        while(start <= end) {
            int mid= (start + end) / 2;

            if(arr[mid] < key){
                start = mid+1;
            }else if(arr[mid] > key){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String args[]){

        int arr[] = {2,4,6,8,10,12,14};
        int key = 12;
        int start = 0;
        int end = arr.length;
        int res1 = BinaryS(arr, key);
        int res2 = BinaryRec(arr, key, start, end);
        if(res1 == -1){
            System.out.println("Key Not Found!!");
        }else{
            System.out.println("Binary Search Using Iteration =  " + res1);
        }
       if(res2 == -1 ){
        System.out.println("Key Not Found!!");
       }else{
        System.out.println("Binary Search Using Recursion =  " + res2);
       }
        
    }
}
