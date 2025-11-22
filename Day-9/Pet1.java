public class Pet1 {
    public static void main(String args[]){

        char ch = 'A';
        int n=4;

        System.out.println("Pattern 1");

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }



        System.out.println("Pattern 2");

            // Pattern 2


        for(int i=n; i>=1; i--){
            for(int j=i; j>=1; j--){
              System.out.print('*');
            }
         System.out.println();
    }

    System.out.println("Pattern 3");

     for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }


        System.out.println("Pattern 4");


        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }

            System.out.println();
        }

    }





}




