public class Diamond_Pat {

    public static void Diamond_Pattern(int n){
        for(int i=1; i<=n; i++){

            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            for(int k=1; k<=(2*i)-1; k++){
                System.out.print("*");
            }


            System.out.println();
        }

        for(int i=n; i>=1; i--){

            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            for(int k=1; k<=(2*i)-1; k++){
                System.out.print("*");
            }


            System.out.println();

            
        }
    }

    public static void main(String args[]){
        Diamond_Pattern(5);

    }
    
}


/*
 * OUTPUT :-
 * IF INPUT n = 5
 * 
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 * *********
 *  *******
 *   *****
 *    ***
 *     * 
 * 
 * 
 */