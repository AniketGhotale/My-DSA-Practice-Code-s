public class Pow {
    
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        return x * power(x, n-1);
    }


    public static int OptimizedPower(int x, int n){
        if(n==0){
            return 1;
        }
        int halfpow = OptimizedPower(x, n/2);
        int pow = halfpow * halfpow;
        if(n%2 != 0){
            pow = x * pow;
        }
        return pow;
    }
    public static void main(String args[]){
        System.out.println(power(2, 10));
        System.out.println(OptimizedPower(2, 10));
    }
}
