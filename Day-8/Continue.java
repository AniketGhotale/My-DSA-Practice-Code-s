public class Continue {
    public static void main(String args[]){

        int n = 10;

        for(int i=1; i<=n; i++){
            if(i==5){
                continue; //Skip the iteration when it reach to 5
            }
            System.out.println(i);
        }
    }
}
