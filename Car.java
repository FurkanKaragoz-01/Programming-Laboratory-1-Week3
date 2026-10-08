
package rentacar;


public class Car {
    
    protected String plateNumber;
    protected String model;
    protected double mileage;
    protected double fuelLevel;
    protected double tankCapacity;
    
    public Car(String plateNumber , String model , double mileage , double fuelLevel , double tankCapacity){
        
        this.plateNumber=plateNumber;
        this.model=model;
        this.mileage=mileage;
        this.tankCapacity=tankCapacity;
        this.fuelLevel=fuelLevel;
    }
    
    public void Drive(int km){
        if(fuelLevel<(km/10)){
            System.out.println("Not Enough Fuel Level !");
        }else{
            System.out.println("Driving....");
            fuelLevel = fuelLevel - km/10;
            mileage+=km;
        }
        
    }
    
    public void Refuel(double lt){
        System.out.println("Refueling ....");
        if((fuelLevel+lt)>tankCapacity){
            fuelLevel+=lt;
            System.out.println("Tank is full , Extra fuel ." + (fuelLevel-tankCapacity)+"lt discarded !");
            fuelLevel= tankCapacity;
        }else{
            fuelLevel+=lt;
        }
    }
    
    public void checkStatus(){
        System.out.println("-------------------");
        System.out.println("Model : " + model);
        System.out.println("Plate : " + plateNumber);
        System.out.println("Mileage : " + mileage);
        System.out.println("Fuel Level : " + fuelLevel);
    
        if(fuelLevel<(tankCapacity/10)){
            System.out.println("Low Fuel Warning !!!");
        }
        System.out.println("-------------------");
    }
    
}
