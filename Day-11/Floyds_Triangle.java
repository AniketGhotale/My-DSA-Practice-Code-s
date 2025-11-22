public class Floyds_Triangle {


    public static void Floyds_Triangle_(int n){

        int counter = 1;

        for(int i=1; i<=n; i++){

            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }

            System.out.println();
        }

    }
    
   

    public static void main(String args[]){
        Floyds_Triangle_(5);
    }
    
}

/*
 * OUTPUT :-
 * IF INPUT n = 5
 * 
 * 1 
 * 2 3 
 * 4 5 6 
 * 7 8 9 10
 * 11 12 13 14 15
 */
