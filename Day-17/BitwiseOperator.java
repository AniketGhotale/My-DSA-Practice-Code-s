public class BitwiseOperator{


    public static void main(String args[]){
        System.out.println("Binar And (&) = 5 & 6 = " + (5&6));  //0101 & 0110 = 0100
        System.out.println("Binary OR (|) = 5 | 6 = " + (5|6));  //0101 & 0110 = 0111
        System.out.println("Binar XOR (^) = 5 ^ 6 = " + (5^6));  //0101 & 0110 = 0011
        System.out.println("Binary Compliment (~) = ~5 = " + (~5));  //0101 = 1010
        System.out.println("Binary Left Shift (<<) = 5 << 2 = " + (5<<2));  //0101  = 01-0100
        System.out.println("Binary Right Shift (>>) = 5 >> 6 = " + (5>>2));  //0101 = 0001-01
                
    }
}