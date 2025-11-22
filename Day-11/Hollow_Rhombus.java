public class Hollow_Rhombus {

    public static void Hello_rhombus(int n){

        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            for(int k=1; k<=n; k++){

                if(k==1 || k==n || i==1 || i==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String args[]){

        Hello_rhombus(8);
    }
    
}

/*
 * OUTPUT :-
 * IF INPUT n = 8
 * 
 *        ********
 *       *      *
 *      *      *    
 *     *      *  
 *    *      *
 *   *      * 
 *  *      * 
 * ********
 */