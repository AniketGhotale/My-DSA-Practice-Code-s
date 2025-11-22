import java.util.*;
public class HashingQuestions {
    
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else{
                map.put(ch, 1);
            }
        }

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(map.get(ch) != null){
                if(map.get(ch) == 1){
                    map.remove(ch);
                }else{
                    map.put(ch, map.get(ch) - 1);
                }
            }else{
                return false;
            }
        }
        return map.isEmpty();
    }

    public static String getStart(HashMap<String,String> tickets){
        HashMap<String,String> revMap = new HashMap<>();
        for(String key : tickets.keySet()){
            revMap.put(tickets.get(key), key);
        }

        for(String key : tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }

        return null;
    }



    public static void main(String args[]){

        int arr[] = {1,3,2,5,1,3,1,5,1};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }

        for(Integer key : map.keySet()){
            if(map.get(key) > arr.length/3){
                System.out.println(key);
            }
        }

        String s = "knee";
        String t = "keen";
        System.out.println("Is "+s+" and "+t+" Are Anagram = " + isAnagram(s, t));


        //count distinct number
        int arr2[] = {4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }
        System.out.println("Total Distinct number = "+set.size() + " and Numbers are");
        for(Integer key : set){
            System.out.print(key+" ");
        }

        //union and Intersect numbers from 2 array
        int arr11[] = {7,3,9};
        int arr22[] = {6,3,9,2,9,4};
        HashSet<Integer> union = new HashSet<>();
        HashSet<Integer> intersect = new HashSet<>();

        //union 
        for(int i=0; i<arr11.length; i++){
            union.add(arr11[i]);
        }
        for(int i=0; i<arr22.length; i++){
            union.add(arr22[i]);
        }
        System.err.println();
        System.out.println("Union of 2 array = "+union.size() + " and Numbers are");
        for(Integer key : union){
            System.out.print(key+" ");
        }
        System.err.println();

        //intersection 
        for(int i=0; i<arr11.length; i++){
            intersect.add(arr11[i]);
        }
        int count = 0;
        for(int i=0; i<arr22.length; i++){
            if(intersect.contains(arr22[i])){
                count++;
                intersect.remove(arr22[i]);
            }
        }
        System.out.println("intersection of 2 array = "+intersect.size() + " and Numbers are");
        for(Integer key : intersect){
            System.out.print(key+" ");
        }
        System.err.println();

        //find itenary from ticket
        HashMap<String,String> ticket = new HashMap<>();
        ticket.put("che", "ben");
        ticket.put("mum", "delhi");
        ticket.put("goa", "che");
        ticket.put("delhi", "goa");

        String start = getStart(ticket);
        System.out.print(start);
        for(String key : ticket.keySet()){
            System.out.print("->" + ticket.get(start));
            start = ticket.get(start);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        int arr33[] = {15,-2,2,-8,1,7,10,23};
        HashMap<Integer,Integer> map1 = new HashMap<>();
        int sum =0;
        int len = 0;
        for(int i=0; i<arr33.length; i++){
            sum+= arr33[i];
            if(map.containsKey(sum)){
                len = Math.max(len, i-map.get(sum));
            }else{
                map.put(sum, i);
            }
        }
        System.out.println("Largest subarray with sum 0 = " + len);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        int arr44[] = {10,2,-2,-20,10};
        int k = -10;
        HashMap<Integer,Integer> map3 = new HashMap<>();
        map3.put(0,1);
        int summ=0;
        int ans=0;

        for(int i=0; i<arr44.length; i++){
            summ+=arr44[i];
            if(map3.containsKey(summ-k)){
                ans += map3.get(summ-k);
            }else{
                map3.put(summ,map3.getOrDefault(summ, 0) +1);
            }
        }
        System.out.println("No of subarray gives -10 result are = "+ans);
    }
}
