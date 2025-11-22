import java.util.Scanner;

public class SubArray {

    public static void Subarr(int arr[]){
        int Total=0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++) {
                int sum = 0;
                for(int k=i; k<=j; k++){
                
                    System.out.print(arr[k] + " ");
                    sum = sum + arr[k];
                    if(largest < sum){
                        largest = sum;
                    }

                    if(smallest > sum) {
                        smallest = sum;
                    }
                }
                Total++;
                System.out.print(" ( Sum = " + sum + " )");
                System.out.print("          ");   
            }
            System.out.println();
        }
        System.out.println("Total SubArray's : "+Total);
        System.out.println("Largest Sum of SubArray's : "+largest);
        System.out.println("Smallest Sum of SubArray's : "+smallest);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of Array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array Element's : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Subarr(arr);

    }
}
