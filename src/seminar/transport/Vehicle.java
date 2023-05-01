package seminar.transport;

public class Vehicle {
    public Vehicle(String vehicleColor, String vehicleModel, int vehicleWeight, int vehicleWheelsAmount, int vehicleMaxSpeed){
        vehicleColor = color;
        vehicleModel = model;
        vehicleWeight = weight;
        vehicleWheelsAmount = wheelsAmount;
        vehicleMaxSpeed = maxSpeed;
    }


    String color;
     public String model;
     public int weight;
     public int wheelsAmount;
     public int maxSpeed;

     public void go(){
         System.out.println("Ехать");
     }

}
