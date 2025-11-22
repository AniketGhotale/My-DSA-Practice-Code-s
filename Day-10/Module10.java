public class Module10{

    //Simple Function

    public static void SimpleFun(){
        System.out.println("Hello World");
    }

    // Call By Value Concept

    public static int CallByValue(int a){
        a=a+5;
        return a;
    }

    // Product of a and b

    public static int product(int a , int b){
        return a*b;
    }
    
    // Factorial Calculation

    public static int factorial(int n){

        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact *i;
            
        }
        return fact;
    }

    // Bionomial Coefficient Calculation

    public static int biocoefficient(int n, int r){

        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_n_r = factorial(n-r);

        int bionomialCoeeficient = fact_n / (fact_r * fact_n_r);
        return bionomialCoeeficient;

    }



    //Function Overloading

    public static int multiply(int a, int b){
        return a*b;
    }

    public static float multiply(float a,float b){
        return a*b;
    }

    public static int multiply(int a, int b, int c){
        return a*b*c;
    }

    public static float multiply(float a,float b,float c){
        return a*b*c;
    }



    // Is Prime And Prime number between Range


    public static boolean isPrime(int n){

        boolean isprime = true;

        if(n==2){
            return true;
        }
        for(int i=2; i<n; i++){
            if(n%i==0){
                isprime = false;
                break;

            }

            
        }

        return isprime;
    }


    public static void primeRange(int n){

        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i +"  ");
            }
        }

        System.out.println();
    }


    // Binary To Decimal Conversion

    public static void binToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int lastNum;
        int decNum = 0;
        while (binNum >0){
            lastNum = binNum%10;
            decNum = decNum + (lastNum * (int)Math.pow(2, pow));

            binNum = binNum /10;
            pow++;
            
        }

        System.out.println("Decimal Number of "+ myNum+" = "+decNum);
    }



    // Decimal To Binary

    public static void decToBin(int decNum){
        int pow=0;
        int mynum = decNum;
        int rem;
        int BinNum = 0;


        while(decNum > 0){
            rem = decNum % 2;

            BinNum = BinNum + (rem * (int)Math.pow(10, pow));

            decNum = decNum / 2;
            pow++;
        }

         System.out.println("Binary Number of "+ mynum+" = "+BinNum);
    }
    public static void main(String args[]){


        int a = 10;
        SimpleFun();
        int res = CallByValue(a);
        System.out.println("Call By value Updated Value = "+res);
        System.out.println("Original a = "+a);

        System.out.println("Product Between "+ 2 + " And "+3+" = " + product(2, 3));
        int f = 5;
        System.out.println("Factorial of " +f + " Number = " + factorial(5));

        int n = 5;
        int r = 2;
        System.out.println("Bionomial Coefficient of " +n +" and "+ r + " = " + biocoefficient(n, r));
 
        System.out.println("Multiply of 2 integer " + multiply(2, 3));
        System.out.println("Multiply of 3 integer " + multiply(2, 3,2));
        System.out.println("Multiply of 2 Float " + multiply(10.5f ,2.5f));
        System.out.println("Multiply of 3 Float " + multiply(10.5f,2.5f,1.5f));


        primeRange(20);



        binToDec(1111);
        decToBin(15);





    }
}