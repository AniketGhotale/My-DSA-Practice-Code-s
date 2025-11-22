public class Triangle_1and0 {

    public static void Triangle_10(int n){

        for(int i=1; i<=n; i++){


            for(int j=1; j<=i; j++){

                if((i+j)%2 == 0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }

            System.out.println();
        }

    }

    public static void main(String args[]){

        Triangle_10(5);
    }
    
}

/*
 * OUTPUT :-
 * IF INPUT n = 5
 * 
 * 1
 * 0 1 
 * 1 0 1
 * 0 1 0 1
 * 1 0 1 0 1
 * 
 */
