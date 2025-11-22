public class LinearSearch {

    public static int LinearS(int arr[] , int key){
        
        for(int i=0 ; i<arr.length; i++) {
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {2,6,4,9,5,7};
        int key = 5;
        int res = LinearS(arr, key);
        if(res == -1){
            System.out.println("Key Not Found!!");
        }else{
            System.out.println("Key is Present at index : " + res);
        }
    }
}