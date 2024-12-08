import java.io.*;
import java.util.*;

public class Ride implements RideInterface  {
    private String rideFacilityName;       // The name of the amusement equipment used for riding.
    private double price;              // The cost of a tourist riding on amusement facilities.
    private Employee rideOperator;   //operator
    private int maxRider;       //How many tourists can be accommodated in one cycle?
    private int numOfCycles = 0;     //The number of times the amusement facilities have been operated.
    private Queue<Visitor> waitingQueue = new LinkedList<>();// Add visitors to the queue.
    public List<Visitor> rideHistory = new LinkedList<>(); // Collection for storing historical records.
    public Ride(){}
    public Ride(String rideFacilityName, double price, int maxRider, Employee rideOperator){
        this.rideFacilityName = rideFacilityName;
        this.price = price;
        this.maxRider = maxRider;
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
        if (visitor != null){
            waitingQueue.add(visitor);
            visitor.printDetails();
            System.out.println("Added to the queue.");
        } else {
            System.out.println("Add failed.");
        }
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
        if (waitingQueue.isEmpty()) {
            System.out.println("There are no visitors in the queue.");
        } else {
            System.out.println("Visitors in the current queue:");
            for (Visitor visitor : waitingQueue) {
                visitor.printDetails();
                System.out.println();
            }
        }
    }

    // Define the specific behavior of operating amusement facilities for one cycle.
    @Override
    public void runOneCycle() {
        if (rideOperator == null) {
            System.out.println("The amusement equipment cannot operate because there is no assigned operator.");
            return;
        }
        if (waitingQueue.isEmpty()) {
            System.out.println("The amusement facilities will not operate as there are no waiting tourists in the queue.");
            return;
        }
        if (maxRider < 1) {
            System.out.println("At least 1 visitor is required to run the ride.");
            return;
        }
        //Declare an array list for storing visitors who have taken rides on amusement facilities.
        List<Visitor> ridersThisCycle = new ArrayList<>();
        while (!waitingQueue.isEmpty() && ridersThisCycle.size() < maxRider) {
            Visitor visitor = waitingQueue.poll();
            ridersThisCycle.add(visitor);
        }

        // Output the information of tourists who ride on the amusement facilities this time.
        System.out.println("Passengers taking the amusement ride this time:");
        for (Visitor visitor : ridersThisCycle) {
            visitor.printDetails();
            System.out.println("Already boarded");
        }

        // Add passenger to history
        rideHistory.addAll(ridersThisCycle);

        // Increase the frequency of operation of amusement facilities
        numOfCycles++;
        System.out.println("The amusement facility has run " + numOfCycles + " times.");
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        if ( visitor != null) {
            rideHistory.add(visitor);
            visitor.printDetails();
            System.out.println(" Added to the visitor history.");
        } else {
            System.out.println("Add failed.");
        }
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        if (rideHistory.contains(visitor)){
            visitor.printDetails();
            System.out.println("In the history of visitor.");
        }
        else {
            System.out.println("Visitor not found in history. ");
        }
        return rideHistory.contains(visitor);
    }

    @Override
    public int numberOfVisitor() {
        if (rideHistory.size() > 0) {
            System.out.println("Number of visitors:" + rideHistory.size());
        } else {
            System.out.println("There are no visitor records.");
        }
        return rideHistory.size();
    }

    @Override
    public void printRideHistory() {
        // Print detailed information of all tourists who have taken the amusement facility using an iterator
        if (rideHistory.isEmpty()){
            System.out.println("There are no visitors in the ride history.");
        }else {
            System.out.println("Historical visitors:");
            Iterator<Visitor> rideIterator = rideHistory.iterator();
            while (rideIterator.hasNext()) {
                Visitor visitor = rideIterator.next();
                visitor.printDetails();
                System.out.println();
            }
        }
    }

    // Create a method to sort the Visitor collection.
    public void sortVisitors(Comparator<Visitor> comparator) {
        try {
            Collections.sort(rideHistory, comparator);
            System.out.println("Visitors sorting successful.");
        } catch (NullPointerException e) {
            System.out.println("Failed to sort visitors: rideHistory is null.");
        }
    }

    //export method
    public void exportRideHistory(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Visitor visitor : rideHistory) {
                writer.write(visitor.getName() + "," + visitor.getId() + "," +
                        visitor.getAge() + "," + visitor.getMembershipStatus() + "," +
                        visitor.getFavoriteRide() + "\n");
            }
            System.out.println("Ride history exported to " + filename);
        } catch (IOException e) {
            System.out.println("Error exporting ride history: " + e.getMessage());
        }
    }

    //import method
    public void importRideHistory(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 5) { // Ensure that the data length is correct.
                    Boolean membershipStatus = Boolean.parseBoolean(data[3]);
                    Visitor visitor = new Visitor(data[0], data[1], Integer.parseInt(data[2]), membershipStatus, data[4]);
                    rideHistory.add(visitor);
                } else {
                    System.out.println("Invalid data format in file: " + line);
                }
            }
            System.out.println("Ride history imported from " + filename);
        } catch (IOException e) {
            System.out.println("Error importing ride history: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error parsing age in file: " + e.getMessage());
        }
    }
}
