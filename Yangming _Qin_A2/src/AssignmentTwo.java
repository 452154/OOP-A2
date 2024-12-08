public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignmentTwo = new AssignmentTwo();
        System.out.println("Part Three-------------------");
        assignmentTwo.partThree();

        System.out.println();
        System.out.println("Part FourA-------------------");
        assignmentTwo.partFourA();

        System.out.println();
        System.out.println("Part FourB-------------------");
        assignmentTwo.partFourB();

        System.out.println();
        System.out.println("Part Five--------------------");
        assignmentTwo.partFive();

        System.out.println();
        System.out.println("Part Six----------------------");
        assignmentTwo.partSix();

        System.out.println();
        System.out.println("Part Seven---------------------");
        assignmentTwo.partSeven();

    }
    public void partThree(){
        Ride ride = new Ride("Roller Coaster", 10.0, 4,
                new Employee("Mary","1001",30,"operator","10"));

        //Add visitors to the queue
        ride.addVisitorToQueue(new Visitor("Devin","3",8,true,"Roller Coaster"));
        ride.addVisitorToQueue(new Visitor("Yang","4",21,true,"Roller Coaster"));
        ride.addVisitorToQueue(new Visitor("Ming","5",18,true,"Roller Coaster"));
        ride.addVisitorToQueue(new Visitor("Alice","1",15,true,"Roller Coaster"));
        ride.addVisitorToQueue(new Visitor("Bob","2",10,true,"Roller Coaster"));

        //Remove a visitor
        ride.removeFromQueue();

        //Print detailed information of visitors in the queue
        ride.printQueue();
    }
    public void partFourA(){
        Ride ride = new Ride("Roller Coaster", 10.0, 4,
                new Employee("Mary","1001",30,"operator","10"));

        Visitor devin = new Visitor("Devin","3",8,true,"Roller Coaster");
        Visitor yang = new Visitor("Yang","4",21,true,"Roller Coaster");
        Visitor ming = new Visitor("Ming","5",18,true,"Roller Coaster");
        Visitor alice = new Visitor("Alice","1",15,true,"Roller Coaster");
        Visitor bob = new Visitor("Bob","2",10,true,"Roller Coaster");

        //Add visitors to the collection
        ride.addVisitorToHistory(devin);
        ride.addVisitorToHistory(yang);
        ride.addVisitorToHistory(ming);
        ride.addVisitorToHistory(alice);
        ride.addVisitorToHistory(bob);

        System.out.println("check whether the visitor is in the ride history.");
        ride.checkVisitorFromHistory(devin);
        ride.checkVisitorFromHistory(yang);
        ride.checkVisitorFromHistory(ming);
        ride.checkVisitorFromHistory(alice);
        ride.checkVisitorFromHistory(bob);

        //Print the number of visitors
        ride.numberOfVisitor();

        //Print detailed information of visitors in the collection
        ride.printRideHistory();
    }
    public void partFourB(){
        Ride ride = new Ride("Roller Coaster", 10.0, 4,
                new Employee("Mary","1001",30,"operator","10"));

        //Add visitors to the collection
        ride.addVisitorToHistory(new Visitor("Devin","3",8,true,"Roller Coaster"));
        ride.addVisitorToHistory(new Visitor("Yang","4",21,true,"Roller Coaster"));
        ride.addVisitorToHistory(new Visitor("Ming","5",18,true,"Roller Coaster"));
        ride.addVisitorToHistory(new Visitor("Alice","1",15,true,"Roller Coaster"));
        ride.addVisitorToHistory(new Visitor("Bob","2",10,true,"Roller Coaster"));

        //Visitor information before sorting
        System.out.println("Before sorting by name :");
        ride.printRideHistory();

        //Call sorting method
        ride.sortVisitors(new VisitorComparator());

        //Sorted visitor information
        System.out.println("After sorting by name :");
        ride.printRideHistory();

    }
    public void partFive(){
        Ride ride = new Ride("Roller Coaster", 10.0, 4,
                new Employee("Mary","1001",30,"operator","10"));

        //Add visitors to the queue
        ride.addVisitorToQueue(new Visitor("Devin","3",8,true,"Roller Coaster"));
        ride.addVisitorToQueue(new Visitor("Yang","4",21,true,"Roller Coaster"));
        ride.addVisitorToQueue(new Visitor("Ming","5",18,true,"Roller Coaster"));
        ride.addVisitorToQueue(new Visitor("Alice","1",15,true,"Roller Coaster"));
        ride.addVisitorToQueue(new Visitor("Bob","2",10,true,"Roller Coaster"));
        ride.addVisitorToQueue(new Visitor("Yu","7",8,true,"Roller Coaster"));
        ride.addVisitorToQueue(new Visitor("Zi","6",21,true,"Roller Coaster"));
        ride.addVisitorToQueue(new Visitor("An","8",18,true,"Roller Coaster"));
        ride.addVisitorToQueue(new Visitor("Ni","9",15,true,"Roller Coaster"));
        ride.addVisitorToQueue(new Visitor("Hao","10",15,true,"Roller Coaster"));

        // Print all visitors in the queue
        ride.printQueue();

        // Run one cycle
        ride.runOneCycle();

        // Print all visitors in the queue after one cycle of operation
        ride.printQueue();

        // Print all visitors in the collection
        ride.printRideHistory();
    }

    public void partSix(){
        Ride ride = new Ride();

        //Add visitors to the collection
        ride.addVisitorToHistory(new Visitor("Devin","3",8,true,"Roller Coaster"));
        ride.addVisitorToHistory(new Visitor("Yang","4",21,true,"Roller Coaster"));
        ride.addVisitorToHistory(new Visitor("Ming","5",18,true,"Roller Coaster"));
        ride.addVisitorToHistory(new Visitor("Alice","1",15,true,"Roller Coaster"));
        ride.addVisitorToHistory(new Visitor("Bob","2",10,true,"Roller Coaster"));

        //export file
        ride.exportRideHistory("ride_history.csv");
    }
    public void partSeven(){
        Ride ride = new Ride();

        // Import files created before
        String filename = "ride_history.csv";
        ride.importRideHistory(filename);

        // Print the number of visitors in the linked list
        ride.numberOfVisitor();

        // Print all visitors in the linked list
        ride.printRideHistory();

    }
}