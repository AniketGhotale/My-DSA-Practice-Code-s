public class Abstraction {
    public static void main(String args[]){
        Dog d = new Dog();
        d.sleep();
        d.bark();
        d.eat();
    }
}

abstract class Animal {
    Animal(){
        System.out.println("Abstract cvlass constructor!");
    }
    abstract void eat();

    void sleep(){
        System.out.println("Sleepss!");
    }
    
}

class Dog extends Animal {
    void eat(){
        System.out.println("Eat's Food!");
    }

    void bark(){
        System.out.println("Bark'sss");
    }
}
