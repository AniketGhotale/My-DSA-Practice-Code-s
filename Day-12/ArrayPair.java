import java.util.Scanner;

public class ArrayPair {
    

    public static void Pairs(int arr[]){
        int tp = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs : " + tp);
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter Array Element's : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Pairs(arr);
        
    }
}
