public class FirstOcc {
    
    public static int firstoccurance(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        int isfound = firstoccurance(arr, key, i+1);
        return isfound;
    }

    public static void main(String args[]){
        int arr[] = {2,3,5,5,5,5,2};
        System.out.println(firstoccurance(arr, 5, 0));
    }    
}
