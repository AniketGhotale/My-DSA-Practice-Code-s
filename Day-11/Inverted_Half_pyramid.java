public class Inverted_Half_pyramid {

    public static void Inverted_Rotated_Half_Pyramid(int n){

        for(int i=1; i<=n; i++){

            //For Space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }


            // For Star
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void main(String args[]){

        Inverted_Rotated_Half_Pyramid(6);

    }
}



/*
 * OUTPUT :-
 * if Input 6 :-
 *      *
 *     **
 *    ***
 *   ****
 *  *****
 * ******
 */