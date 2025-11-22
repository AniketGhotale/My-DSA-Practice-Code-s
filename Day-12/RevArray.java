public class RevArray {

    public static void Revarr(int arr[]) {
        int first = 0 , last = arr.length-1;

        while(first <= last) {

            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;

        }


        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]) {

        int arr[] = {1,5,8,6,4,3};
        Revarr(arr);
    }
    
}
