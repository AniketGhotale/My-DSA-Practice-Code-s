public class Hollow_Rect {


    public static void hollow_rectangle(int n){
        for(int i=1; i<=n; i++){

            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollow_rectangle(8);

    }
}
/*
 * Output :-
 * if n = 8
 * ********
 * *      *
 * *      *
 * *      *
 * *      *
 * *      *
 * *      *
 * ********
 */