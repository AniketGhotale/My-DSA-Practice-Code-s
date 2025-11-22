public class Loop{


    public static void main(String args[]){

        // print 1 to 10 using for, while and do while loop
        int sumforloop = 0;
        int n=10;
        System.out.println("using For Loop");
        for(int i=1; i<=n; i++){
            System.out.println("i = "+i);
            sumforloop = sumforloop+i;
        }

        System.out.println("Sum for For Loop : "+sumforloop);

        System.out.println();
        System.out.println("Using While Loop");
        int sumwhile = 0;
        int i = 1;
        while(i <= n){
            System.out.println("i = "+ i);
            sumwhile = sumwhile+i;
            i++;
        }

        System.out.println("Sum for While Loop : "  + sumwhile);

        System.out.println();
        int sumdowhile = 0;
        int l = 1;
        int m = 10;
        System.out.println("Using Do-While Loop");
        do{
            System.out.println("i = "+ l);
            sumdowhile = sumdowhile+l;
            l++;
            
            
            
        }while(l<=m);

        System.out.println("Sum for Do-While Loop : " +sumdowhile);
        System.out.println();

    }
}