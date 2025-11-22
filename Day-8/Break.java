public class Break {
    public static void main(String args[]){

        int n = 10;
        for( int i=1; i<=n; i++){

            System.out.println(i);
            
            if(i==5){
                break; // Exit from loop when it reach to 5
            }
            
        }
    }
}
