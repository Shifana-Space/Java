package practice.java;

class interface {
    String name;


    Person(String name) {
        this.name = name;
        System.out.println(name); 
    }
}

class Employee extends Person {
    int Employeeid;

  
    Employee() {
        super("Default Name"); 
        System.out.println("test");
    }

    void display() {
        System.out.println("Detail of employee");
    }
}

public class Mainclass {
    public static void main(String[] args) {
//        Person p1 = new Person("vijay"); 
        Employee e1 = new Employee();
        e1.display(); 
    }
}
