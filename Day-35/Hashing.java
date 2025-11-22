import java.util.*;
public class Hashing {


    public static void main(String args[]){
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Pune", 10000);
        hm.put("mumbai",1000);
        hm.put("Delhi", 20000);
        for(String key : hm.keySet()){
            System.out.print(key + " -> " + hm.get(key) + "  ");
        }
        System.err.println();
        System.out.println(hm);
        System.out.print(hm.get("Pune"));
        System.out.println();
        System.out.print(hm.containsKey("Pune"));
        System.out.println();
        System.out.print(hm.remove("Pune"));
        System.out.println();
        System.out.print(hm.size());
        System.out.println();
        System.out.print(hm.isEmpty());
        System.out.println();
        hm.clear();
        System.out.print(hm.isEmpty());
        System.err.println();
        System.err.println();
        System.err.println();


        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("Pune", 10000);
        lhm.put("mumbai",1000);
        lhm.put("Delhi", 20000);
        for(String key : lhm.keySet()){
            System.out.print(key + " -> " + lhm.get(key)+ "  ");
        }
        System.err.println();
        System.out.println(lhm);
        System.out.print(lhm.get("Pune"));
        System.out.println();
        System.out.print(lhm.containsKey("Pune"));
        System.out.println();
        System.out.print(lhm.remove("Pune"));
        System.out.println();
        System.out.print(hm.size());
        System.out.println();
        System.out.print(lhm.isEmpty());
        System.out.println();
        lhm.clear();
        System.out.print(lhm.isEmpty());
        System.err.println();
        System.err.println();
        System.err.println();


        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("Pune", 10000);
        tm.put("mumbai",1000);
        tm.put("Delhi", 20000);
        for(String key : tm.keySet()){
            System.out.print(key + " -> " + tm.get(key)+ "  ");
        }
        System.err.println();
        System.out.println(tm);
        System.out.print(tm.get("Pune"));
        System.out.println();
        System.out.print(tm.containsKey("Pune"));
        System.out.println();
        System.out.print(tm.remove("Pune"));
        System.out.println();
        System.out.print(tm.size());
        System.out.println();
        System.out.print(tm.isEmpty());
        System.out.println();
        tm.clear();
        System.out.print(tm.isEmpty());
        System.err.println();
        System.err.println();
        System.err.println();



    }
}