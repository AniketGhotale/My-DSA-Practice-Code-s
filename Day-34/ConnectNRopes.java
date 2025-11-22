import java.util.PriorityQueue;

public class ConnectNRopes {
    

    public static void main(String args[]){

        int ropes[] = {2,3,3,4,6}; //2+3 =5, 3+4=7, 5+6=11 11+7=18 (5+7+11+18 = 41) answer = 41

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<ropes.length; i++){
            pq.add(ropes[i]);
        }

        int costs = 0;
        while (pq.size() > 1) {
            int min1  = pq.remove();
            int min2 = pq.remove();

            costs += min1 + min2;
             pq.add(min1+min2);
        }

        System.out.println("Cost = " + costs);
    }
}
