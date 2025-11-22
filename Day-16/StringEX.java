import java.util.Scanner;

public class StringEX {

    public static void substr(String str , int si , int ei){

        for(int i=si; i<ei; i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();

    }
    public static void main(String args[]){
        String str1 = "Hello";
        String str2 = "Hello";
        substr(str2, 0, 3);
        System.out.println(str1.substring(0,3));
         System.out.println(str1.charAt(0));
        String str5 = str1 + " " + str2;
         System.out.println("Concat : " + str5);
         System.out.println(str1.length());
        String str3 = new String("Hello");
        String str4;
        Scanner sc = new Scanner(System.in);
        //str4 = sc.nextLine();    //next() = only read single word
        // System.out.println(str4);

        if(str1 == str2){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }


        if(str1 == str3){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }

        if(str1.equals(str3)){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }
    }
}