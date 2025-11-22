import java.util.Scanner;

public class Reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int lastdigit;
        int rev = 0;

         while(n>0){
            lastdigit = n%10;
            rev = (rev*10) + lastdigit;
            
            System.out.print(lastdigit);
            
            n = n/10;

         }
         System.out.println();
         System.out.println("Reverse No = "+rev);
        
    }
}
