import java.util.Scanner;

public class variable {
    public static void main(String args[]){
        System.out.println("Hello From Java");
        int var = 10; //Variable
        System.out.println("var value is = " + var);


        // This is Single line comment
        /*This is 
        MultiLine Comment  */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        System.out.println(a);
        System.out.println("Enter a number : ");
        int b = sc.nextInt();
        System.out.println(b);
        int sum = a+b;
        System.out.println("Sum = " + sum);


        // Type Conversion
        float c = a;
        System.out.println("C = " + c);

        int d = (int) c;
        System.out.println("D = "+ d);

        int i = 10;
        float f = 10.25f;
        double dou = 10.258;
        byte by = 15;
        char ch = 'a';
        boolean bo = true;
        short sh = 2;
        long lo = 12548;
        System.out.println(i+ " " + f + " " + dou + " " + by + " " + ch + " " + bo + " " + sh + " " + lo);

    }
}