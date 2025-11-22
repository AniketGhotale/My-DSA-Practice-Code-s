import java.util.*;

public class ArraylistOp {

    public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(0));
        list.remove(0);
        System.out.println(list);
        
        list.set(1,10);
        list.add(1,3);
        System.out.println(list);
        System.out.println(list.contains(10));
        System.out.println(list.size());
    }
}