public class Polymorphism {
    public static void main(String args[]){
        Cal c = new Cal();
        Add a = new Add();
        System.out.println(c.sum((float)1.5,(float) 2.5));
        System.out.println(c.sum(2, 5));
        System.out.println(a.sum(2, 7));
        System.out.println(c.sum(2, 5, 7));
        

    }
}

class Cal{

    int sum(int a,int b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    } 

    float sum(float a, float b){
        return a+b;
    }
}

class Add extends Cal {
    int sum(int a ,int b){
        return a+b;
    }
}
