import java.util.*;
public class HashingSet {
    
    public static void main(String args[]){
        HashSet<Integer> hs = new HashSet<>();
        hs.add(15);
        hs.add(47);
        hs.add(65);
        for(Integer key : hs){
            System.out.print(key + " ");
        }
        System.err.println();
        System.out.println(hs.contains(15));
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());
        System.out.println(hs.remove(15));
        hs.clear();
        System.out.println(hs.isEmpty());
        System.err.println();
        System.err.println();
        System.err.println();


        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(15);
        lhs.add(47);
        lhs.add(65);
        for(Integer key : lhs){
            System.out.print(key + " ");
        }
        System.err.println();
        System.out.println(lhs.contains(15));
        System.out.println(lhs.size());
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.remove(15));
        lhs.clear();
        System.out.println(lhs.isEmpty());
        System.err.println();
        System.err.println();
        System.err.println();


        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(15);
        ts.add(47);
        ts.add(65);
        for(Integer key : ts){
            System.out.print(key + " ");
        }
        System.err.println();
        System.out.println(ts.contains(15));
        System.out.println(ts.size());
        System.out.println(ts.isEmpty());
        System.out.println(ts.remove(15));
        ts.clear();
        System.out.println(ts.isEmpty());
        
    }
}
