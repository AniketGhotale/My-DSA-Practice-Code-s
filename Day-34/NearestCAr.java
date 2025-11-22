import java.util.PriorityQueue;

public class NearestCAr {
    
    static class Car implements Comparable<Car>{
        int x;
        int y;
        int dist;
        int idx;

        Car(int x, int y,int dist, int idx){
            this.x = x;
            this.y = y;
            this.dist = dist;
            this.idx = idx;
        }

        @Override
        public int compareTo(Car c2){
            return this.dist - c2.dist; 
        }
    }


    public static void main(String args[]){

        int pts[][] = {
            {3,3},{5,-1},{-2,4}
        };

        PriorityQueue<Car> pq = new PriorityQueue<>();
        int k =2;

        for(int i=0; i<pts.length; i++){
            int dist = (pts[i][0] * pts[i][0]) + (pts[i][1] * pts[i][1]);
            pq.add(new Car(pts[i][0],pts[i][1],dist,i));
        }
        

        for(int i=0; i<k; i++){
            System.out.println("C" + pq.remove().idx);
        }
    }
}
