public class Compare {
    
    public static String CompareTo(String arr[]){

        String largest = arr[0];

        for(int i=0; i<arr.length; i++){
            if(largest.compareTo(arr[i]) < 0){
                largest = arr[i];
            }
        }

        return largest;
    }
    public static void main(String args[]){
        String arr[] = {"aaa", "aab", "abb"};
        System.out.println(CompareTo(arr));
    }
}
