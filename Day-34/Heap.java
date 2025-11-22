import java.util.ArrayList;

public class Heap {
    
    ArrayList<Integer> arr = new ArrayList<>();

    public void add(int data){  //O(n logn)

        //step 1 Add at last
        arr.add(data);


        //Step 2 Fix Heap
        int x = arr.size()-1;
        int par = (x-1)/2;

        while(arr.get(x) < arr.get(par)){

            int temp = arr.get(x);
            arr.set(x,arr.get(par));
            arr.set(par,temp);

            x = par;
            par = (x-1)/2;
        }
    }

    public int peek(){
        return arr.get(0);    //O(1)
    }

    public void heapify(int i){

        int leftchildidx = (2*i) + 1;
        int rightchildidx = (2*i) + 2;
        int minidx = i;

        if(leftchildidx < arr.size()-1 && leftchildidx < arr.get(minidx)){
            minidx = leftchildidx;
        }

        if(rightchildidx < arr.size()-1 && rightchildidx < arr.get(minidx)){
            minidx = rightchildidx;
        }
        
        if(minidx != i) {
          
            int temp = arr.get(i);
            arr.set(i,arr.get(minidx));
            arr.set(minidx, temp);

            heapify(minidx);
        }
    
    }
    public int remove() {

        int data = arr.get(0);

        //step 1 swap 1st and last
        int temp = arr.get(0);
        arr.set(0,arr.get(arr.size()-1));
        arr.set(arr.size()-1, temp);

        //step 2 remove last
        arr.remove(arr.size()-1);

        //step 3 fix heap using Heapify
        heapify(0);

        return data;


    }
    
    public boolean isEmpty(){
        return arr.size() == 0;
    }

    public static void main(String args[]){


        Heap h = new Heap();
        h.add(4);
        h.add(2);
        h.add(3);
        h.add(1);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}
