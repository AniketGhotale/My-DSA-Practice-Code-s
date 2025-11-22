public class Interface {
    public static void main(String args[]){
        DerivedClass d = new DerivedClass();
         DerivedClass d1 = new DerivedClass();
        d.schoolname="abc";
        d.name="Aniket";
        System.out.println(d.schoolname);
        System.out.println(d.name);
        d1.schoolname="xyz";
        System.out.println(d.schoolname);
        System.out.println(d1.schoolname);
        d1.name = "Ram";
        System.out.println(d.name);
        System.out.println(d1.name);



    
        d.eat();
    }
    
}

interface BaseInterface {
    String a = "vksj";
    void eat();
}

class DerivedClass implements BaseInterface{
    static String schoolname;
    String name;

    public void eat(){
        System.out.println(a);
        System.out.println("Eat food");
        
    }
}
