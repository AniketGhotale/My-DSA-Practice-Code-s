public class Inverted_Half_Pyrimid_Number {

    public static void Inverted_Half_Pyrimid_With_Number(int n){


        for(int i=1; i<=n; i++){

            for(int j=1; j<=(n-i)+1; j++){
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }

    public static void main(String args[]){

        Inverted_Half_Pyrimid_With_Number(7);

    }
    
}

/*
 * OUTPUT:-
 * IF INPUT = n = 7
 * 
 * 1 2 3 4 5 6 7
 * 1 2 3 4 5 6
 * 1 2 3 4 5
 * 1 2 3 4 
 * 1 2 3
 * 1 2
 * 1
 */
