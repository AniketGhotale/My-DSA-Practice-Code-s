import java.util.ArrayList;

public class MaxWaterContain {
    
    // public static void maxwater(ArrayList<Integer> list){

    //     int max = 0;

    //     for(int i=0; i<list.size(); i++){
    //         for(int j=i+1; j<list.size(); j++){
    //             int ht = Math.min(list.get(i), list.get(j));
    //             int wt = j-i;
    //             int curr = ht * wt;
    //             max = Math.max(max, curr);
    //         }
    //     }

    //     System.out.println(max);
    // }


    public static void maxwater(ArrayList<Integer> list){
        int lp = 0 , max = 0;
        int rp = list.size() - 1;

        while (lp < rp) {
            int ht = Math.min(list.get(lp), list.get(rp));
            int wt = rp-lp;
            int curr = ht * wt;
            max = Math.max(max, curr);
            if(list.get(lp) < list.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }

        System.out.println(max);

    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        maxwater(list);
    }
}
