import java.util.Scanner;

public class UserArr {

    public static void main(String args[]){

        Scanner sc = new Scanner((System.in));
        int size = sc.nextInt();
        int arr[] = new int[size];

        //input
        for( int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        //value of key
        int key = sc.nextInt();

        //output
        for(int i=0; i<size; i++) {
            if(arr[i] == key) {
                System.out.println("Key Found at = " + i);    
            }
        }

    }
}