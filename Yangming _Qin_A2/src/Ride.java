import java.util.LinkedList;
import java.util.Queue;

public class Ride implements RideInterface  {
    private String rideFacilityName;       // The name of the amusement equipment used for riding.
    private double price;              // The cost of a tourist riding on amusement facilities.
    private Employee rideOperator;   //operator
    private Queue<Visitor> waitingQueue = new LinkedList<>();// Add visitors to the queue.
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


    @Override
    public void addVisitorToQueue(Visitor visitor) {
        waitingQueue.add(visitor);
        visitor.printDetails();
        System.out.println("Added to the queue.");

    }

    @Override
    public void removeFromQueue() {
        if (!waitingQueue.isEmpty()) {
            Visitor visitor = waitingQueue.poll();
            visitor.printDetails();
            System.out.println("Removed from the queue.");

        } else {
            System.out.println("The queue is empty and cannot be removed.");
        }

    }

    @Override
    public void printQueue() {
        System.out.println("Visitors in the current queue:");
        for (Visitor visitor : waitingQueue) {
            visitor.printDetails();
            System.out.println();
        }

    }

    @Override
    public void runOneCycle() {

    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {

    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        return false;
    }

    @Override
    public int numberOfVisitor() {
        return 0;
    }

    @Override
    public void printRideHistory() {

    }
}
