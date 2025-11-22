public class Constructor{
    

    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("Aniket");
    }
}

class Student{

    String name;
    Student(){
        System.out.println("Default (Non-Parimaterized Constructor !!)");
    }
    Student(String name){
        this.name = name;
        System.out.println("Parameterized Constructor !!");
        System.out.println(name);
    }
}