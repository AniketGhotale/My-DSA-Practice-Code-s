import java.util.*;

public class ArrayEleSwap {
    
    public static void swap(ArrayList<Integer> list , int i1,int i2){

        int temp = list.get(i1);
        list.set(i1,list.get(i2));
        list.set(i2,temp);
        System.out.println(list);
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=5; i++){
            list.add(i);
        }
        System.out.println(list);
        swap(list, 2, 4);
    }
}
