public class SmAndLg {
    
    public static int Compare(int arr[]) {
        int smallest = Integer.MAX_VALUE; //it gives Maximum Value in  Number System
        int largest = Integer.MIN_VALUE;  // it Gives Minimum Value in Number System

        for(int i=0; i<arr.length; i++){

            if(arr[i] > largest) {
                largest = arr[i];
            }
            if(arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest Numbr in Array = " + largest);
        return smallest;
    }
    public static void main(String args[]) {
        int arr[] = {2,8,6,7,5,1,9,15};
        int sm = Compare(arr);
        System.out.println("Smallest Number in Array = " + sm);
    }
}
