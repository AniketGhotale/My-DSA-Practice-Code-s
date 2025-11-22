public class BitQuestions {
    
    public static void isEvenorOdd(int n){
        if((n & 1) == 0 ){
            System.out.println("Number is Even !!");
        }else{
            System.out.println("Number is Odd !!");
        }
    }


    public static int getiBit(int n, int i){

        int maskbit = 1<<i;
        if((n & maskbit)== 0){
            return 0;
        }
        return 1;
    }

    public static int setiBit(int n, int i){
        int maskbit = 1<<i;
        return n | maskbit;
    }

    public static int cleariBit(int n, int i){
        int maskbit = ~(1<<i);
        return n & maskbit;
    }

    public static int clearlastiBit(int n, int i){
        int maskbit = (~0)<<i;
        return n & maskbit;
    }

    public static int clearrangeiBit(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int maskbit = a | b;
        return n & maskbit;
    }

    public static boolean ispower(int n){
        if((n & (n-1)) == 0){
            return true;
        }
        return false;
    }

    public static int getcount(int n){
        int count = 0;
        while (n > 0) {
            if((n & 1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }


    public static int update(int n, int i , int newBit){

        // if(newBit == 0){
        //     return cleariBit(n, i);
        // }else{
        //     return setiBit(n, i);
        // }
        //int maskbit = 1<<i;
        n = cleariBit(n, i);
        int maskbit = newBit<<i;
        //System.out.println(maskbit);
        return n | maskbit;

    }

    public static void main(String args[]){
        isEvenorOdd(4);
        isEvenorOdd(5);
        System.out.println(getiBit(6, 2));
        System.out.println(setiBit(10, 2));
        System.out.println(cleariBit(6, 2));
        System.out.println(clearlastiBit(15, 2));
        System.out.println(clearrangeiBit(15, 0, 2));
        System.out.println(ispower(4));
        System.out.println(ispower(5));
        System.out.println(getcount(5));
        System.out.println(update(15, 2, 0));

    }
}
