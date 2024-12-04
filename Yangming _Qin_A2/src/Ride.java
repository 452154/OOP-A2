public class Ride  {
    private String rideFacilityName;       // The name of the amusement equipment used for riding.
    private double price;              // The cost of a tourist riding on amusement facilities.
    private Employee rideOperator;   //operator
    public Ride(){}
    public Ride(String rideFacilityName, double price, int maxRider, Employee rideOperator){
        this.rideFacilityName = rideFacilityName;
        this.price = price;
        this.rideOperator = rideOperator;

    }
    public String getRideFacilityName(){return rideFacilityName;}
    public void setRideFacilityName(String rideFacilityName){this.rideFacilityName = rideFacilityName;}
    public double getPrice(){return price;}
    public void setPrice(double price){this.price = price;}
    public Employee getRideOperator(){return rideOperator;}
    public void setRideOperator(Employee rideOperator){this.rideOperator = rideOperator;}


}
