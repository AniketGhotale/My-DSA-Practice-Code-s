import java.util.PriorityQueue;

public class WeakestSolder {
    

    static class Row implements Comparable<Row>{

        int solder;
        int idx;

        Row(int solder,int idx){
            this.solder = solder;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row r2){
            if(this.solder == r2.solder){
                return this.idx - r2.idx;
            }
            return this.solder - r2.solder;
        }
    }

    public static void main(String args[]){
        int army[][] = {
            {1,0,0,0},
            {1,1,1,1},
            {1,0,0,0},
            {1,0,0,0}
        };
        int k=2;

        PriorityQueue<Row> pq = new PriorityQueue<>();
        for(int i=0; i<army.length; i++){
            int count = 0;
            for(int j=0; j<army[i].length; j++){
                count += army[i][j] == 1  ? 1: 0;
            }
            pq.add(new Row(count,i));
        }

        for(int i=0; i<k; i++){
            System.out.println("R" + pq.remove().idx);
        }
    }
}
