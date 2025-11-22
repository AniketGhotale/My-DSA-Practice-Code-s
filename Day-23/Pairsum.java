import java.util.ArrayList;

public class Pairsum {
    
    // public static boolean pairsum(ArrayList<Integer> list, int target){

    //     for(int i=0; i<list.size(); i++){
    //         for(int j=i+1; j<list.size(); j++){
    //             if(list.get(i) + list.get(j) == target){
    //                 return true;
    //             }
    //         }
    //     }

    //     return false;
    // }

    // public static boolean pairsum(ArrayList<Integer> list, int target){
    //     int lp = 0; 
    //     int rp = list.size()-1;

    //     while (lp < rp) {
            

    //         if(list.get(lp) + list.get(rp) == target){
    //             return true;
    //         }

    //         if(list.get(lp) + list.get(rp) < target){
    //             lp++;
    //         }else{
    //             rp--;
    //         }
    //     }

    //     return false;

    // }

    public static boolean pairRotatedsum(ArrayList<Integer> list, int target){

        int bp = -1;
        int n= list.size()-1;
        int ival = 0,jval = 0;

        for(int i=0; i<list.size(); i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        }
        int lp=bp+1;
        int rp = bp;
        while (lp != rp) {
            ival = list.get(lp);
            jval = list.get(rp);
            if(list.get(lp) + list.get(rp) == target){
                System.out.println(ival);
        System.out.println(jval);
                return true;
            }

            if(list.get(lp) + list.get(rp) < target){
                lp = (lp+1) % n;
            }else{
                rp = (n + rp -1 ) % n;
            }
        }
        System.out.println(ival);
        System.out.println(jval);
        return false;
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);
        
        System.out.println(pairRotatedsum(list, 5));
    }
}
