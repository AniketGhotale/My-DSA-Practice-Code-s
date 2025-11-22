public class Inheritance {
    
    public static void main(String args[]){
        Car c = new Car();
        c.type();
        c.color = "Red";
        c.setcolor();

        Bike b = new Bike();
        b.type();;
        b.cc();

        Vehical v = new Car();
        v.type();
        //v.setcolor();
    }
}

class Vehical {
    Vehical(){
        System.out.println("Vehical Contructor!!");
    }
    String color;
    int model = 2020;
    void type (){
        System.out.println("Four Wheeler !");
    }
}

class Car extends Vehical {
    void setcolor(){
        
        //super.color = color;
        System.out.println("Color " + color);
        
        super.type();
        System.out.println(super.model);
    }    
}

class Bike extends Vehical{
    Bike(){
        super();
    }
    void cc(){
        
        System.out.println("350 CC");
    }
}