import java.util.*;

public class Co{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter B :");
        int b = sc.nextInt();
        System.out.println("Enter C :");
        int c = sc.nextInt();


        int res1 = (a>b) ? a : b;
        System.out.println("Largest between A and B " + res1);
        int Result = ((a>=b) && (a>=c)) ? a : (b>=c) ? b : c;
        System.out.println("Largest between A and B and C " + Result);


        if((a>=b) && (a>=c)){
            System.out.println("A is Grether " + a + ">" + b + ">" + c);
        }else if(b>c){
            System.out.println("B is Grether " + b + ">" + a + ">" + c);
        }else{
            System.out.println("C is Grether " + c + ">" + a + ">" + b);
        }


        System.out.println("Enter any Opertator to perform an Operation (+,-,*,/,%):");
        char op = sc.next().charAt(0);
        System.out.println("Enter Num1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter Num2 :");
        int num2 = sc.nextInt();
        int res;

        switch ((op)) {
            case '+': res= num1+num2;
            System.out.println("Result = "+res);
                
                break;
            case '-': res= num1-num2;
            System.out.println("Result = "+res);
            break;
            case '*': res= num1*num2;
            System.out.println("Result = "+res);
            break;
            case '/': res= num1/num2;
            System.out.println("Result = "+res);
            break;
            case '%': res= num1%num2;
            System.out.println("Result = "+res);
            break;
        
            default: System.out.println("Invalid Choice !!! Please Ener Valid Choice !" );
        
        }

        System.out.println("Enter any Year");
        int year = sc.nextInt();
        if((year%4==0) && (year%100==0) && (year%400==0)){
            System.out.println(year + " is an a Leap Year");
        }else{
            System.out.println(year + " is not an Leap Year");
        }


    }
}