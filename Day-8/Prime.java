import java.util.Scanner;

public class Prime {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        boolean isprime= true;

        if(n==2){
            System.out.println("Number is Prime : "+n);
        }else{
            
            for(int i=2; i<n;i++){
            if(n%i == 0){
                isprime = false;

            }
        }

        if(isprime == true){
            System.out.println("Number is Prime : "+n);
        }else{
            System.out.println("Number is NOt Prime : "+n);
        }

        }

        
    } 
}
