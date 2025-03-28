class Vehicles{
    void displayinfo(){
        System.out.println("This is a vehicle");
    }
}
class Car extends Vehicles{
    String brand;
    String colour;
    Car(String brand, String colour){
        this.brand = brand;
        this.colour = colour;
    }
    void displayinfo(){
        System.out.println("This is a car");
        System.out.println("car brand = "+ brand + ",car colour = "+ colour);
    }
}
public class overrideexample{
    public static void main(String[] args){
        Vehicles V = new Vehicles();
        V.displayinfo();
        Car C = new Car("Audi","White");
        C.displayinfo();
    
        
    }
}
