import java.util.*;

public class Inbuildsort {
    public static void main(String args[]){

        int arr[] = {5,2,4,1,3,7,6};
        // Arrays.sort(arr);
        //Arrays.sort(arr , Collections.reverseOrder());
        //Arrays.sort(arr , 0, 3 ,Collections.reverseOrder());
        Arrays.sort(arr , 0 , 3);  
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
