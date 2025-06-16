package practice.java;

class Vehicle {
    String Brand;
    int Year;
    void StartEngine(){
        System.out.println("This is Vehicle");
    }
}
class Car extends Vehicle{
    String fuelType;

    void StartEngine() {
        System.out.println("Car engine starts");
    }
    void drive(){
        System.out.println("Car is driving");
    }
}
class Truck extends Vehicle {
    int LoadCapacity ;
    void StartEngine() {
        System.out.println("Truck engine starts");
    }
    void haul(){
        System.out.println("Truck is hauling");
    }
}
public class Mainclass{
    public static void main(String[] args){
        Car c1 = new Car();
      c1.Brand = "BMW";
      c1.Year = 2000;
      c1.fuelType ="petrol";
      c1.StartEngine();
      c1.drive();
      Truck t1 = new Truck();
      t1.LoadCapacity = 19 ;
      t1.Brand = "AUDI";
      t1.Year = 1988 ; 
      t1.StartEngine();
      t1.haul();
    }
    }