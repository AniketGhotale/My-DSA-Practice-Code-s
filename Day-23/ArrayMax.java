import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayMax {
    
    public static void MaxArrEle(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<list.size(); i++){
            if(max < list.get(i)){
                max = list.get(i); // max = Math.max(max, list.get(i));
            }
        }

        System.out.println("Max Element = " + max);
    }
    public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(9);
        list.add(1);
        list.add(6);
        MaxArrEle(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }
}
