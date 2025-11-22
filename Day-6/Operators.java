public class Operators {
    public static void main (String args[]){
        System.out.println("Operator's in Java");
        int a = 10;
        int b = 5;
        System.out.println("Arithmatic Operator : ");
        System.out.println("A + B = " + (a+b));
        System.out.println("A - B = " + (a-b));
        System.out.println("A * B = " + (a*b));
        System.out.println("A / B = " + (a/b));
        System.out.println("A % B = " + (a%b));

        System.out.println("Unary Operator : ");
        System.out.println("++A = " + (++a));
        System.out.println("A++ = " + (a++));
        System.out.println("--A = " + (--a));
        System.out.println("A-- = " + (a--));


        System.out.println("Comparative or Relational Operator : ");
        System.out.println("A > B = " + (a>b));
        System.out.println("A >= B = " + (a>=b));
        System.out.println("A < B = " + (a<b));
        System.out.println("A <= B = " + (a<=b));
        System.out.println("A == B = " + (a==b));
        System.out.println("A != B = " + (a!=b));

        System.out.println("Assignment Operator : ");
        System.out.println("A = B = " + (a=b));
        System.out.println("A += B = " + (a+=b));
        System.out.println("A -= B = " + (a-=b));
        System.out.println("A *= B = " + (a*=b));
        System.out.println("A /= B = " + (a/=b));
        System.out.println("A %= B = " + (a%=b));


        System.out.println("Logical Operator : ");
        System.out.println("(A > B) && (A < B) = " + ((a>b)&&(a<b)));
        System.out.println("(A > B) || (A < B) = " + ((a>b)||(a<b)));
        System.out.println("!(A < B) = " + (!(a<b)));

    }
}