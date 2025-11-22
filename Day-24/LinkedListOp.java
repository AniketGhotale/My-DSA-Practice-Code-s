public class LinkedListOp {

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;


//AddFirst
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

//AddLast
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

//InsertMid
    public void insertmid(int idx, int data){
        Node newNode = new Node(data);
        size++;
        Node prev = head;
        for(int i=0; i<idx-1; i++){
            prev = prev.next;
        }
        newNode.next = prev.next;
        prev.next = newNode;
    }


//removeFirst
    public int removeFirst(){
        if(head == null){
            System.out.println("Empty!!");
            return -1;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }


//RemoveLast
    public int removeLast(){
        Node prev = head;
        if(head == null){
            return -1;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        size--;
        tail = prev;
        return val;
    }


//Search
    public int itrsearch(int key){
        Node temp = head;
        int i=0;
        while (temp != null) {
            if(temp.data == key){
                //System.out.println("Element Found At "+ i);
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

//ReverseLL
    public void revll(){
        Node curr = tail = head;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

//Find And Remove Nth Ele from END!!
    public int removen(int n){
        Node temp = head;
        int sz = 0;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        //System.out.println(sz);
        if(n == sz){
            int val = head.data;
            head = head.next;
            return val;
        }
        Node prev = head;
        for(int i=1; i<(sz-n); i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = prev.next.next;
        return val; 
    }

//LL is Palindrome or not
    public boolean isPalidrome(){
        Node slow = head;
        Node fast = head;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        Node curr = mid.next;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //head = prev;
        Node right = prev;
        Node left = head;
        while (right != null) {
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }


//Print
    public void printll(){
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        LinkedListOp ll = new LinkedListOp();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(5);
        ll.addLast(6);
        ll.insertmid(3, 4);
        ll.printll();
        System.out.println("Size = "+ size);
        System.out.println(ll.removeFirst());
        ll.printll();
        System.out.println(ll.removeLast());
        ll.printll();
        System.out.println("Size = "+ size);
        System.out.println(ll.itrsearch(4));
        ll.revll();
        ll.printll();
        System.out.println(ll.removen(2));
        ll.printll();
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeFirst());
        ll.printll();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        System.out.println(ll.isPalidrome());
    }
}