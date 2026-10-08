
package rentacar;


public class RentACar {

    
    public static void main(String[] args) {
        
        Car car = new Car("38 RE 361", "Tofaş" , 0.0,0.0,50.0);
        
        car.checkStatus();
        car.Refuel(65);
        car.Drive(30);
        
        car.checkStatus();
        
        
    }
    
}
