import java.util.*;
public class PriorityQueueEX {


    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name , int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }

    public static void main(String args[]){

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        
        pq.add(3);
        pq.add(1);
        pq.add(4);
        pq.add(2);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
        System.out.println();


        PriorityQueue<Student> pqObj = new PriorityQueue<>();
        pqObj.add(new Student("A",5));
        pqObj.add(new Student("B", 2));
        pqObj.add(new Student("C", 7));
        pqObj.add(new Student("D",1));

        while(!pqObj.isEmpty()){
            System.out.println(pqObj.peek().name + "->" + pqObj.peek().rank);
            pqObj.remove();
        }
    }
}