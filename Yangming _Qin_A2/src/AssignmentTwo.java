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

        //Add visitors to the collection
        ride.addVisitorToHistory(new Visitor("Devin","3",8,true,"Roller Coaster"));
        ride.addVisitorToHistory(new Visitor("Yang","4",21,true,"Roller Coaster"));
        ride.addVisitorToHistory(new Visitor("Ming","5",18,true,"Roller Coaster"));
        ride.addVisitorToHistory(new Visitor("Alice","1",15,true,"Roller Coaster"));
        ride.addVisitorToHistory(new Visitor("Bob","2",10,true,"Roller Coaster"));

        //Check if the visitor is in the collection
        ride.checkVisitorFromHistory(new Visitor("Devin","3",8,true,"Roller Coaster"));
        ride.checkVisitorFromHistory(new Visitor("Yang","4",21,true,"Roller Coaster"));
        ride.checkVisitorFromHistory(new Visitor("Ming","5",18,true,"Roller Coaster"));
        ride.checkVisitorFromHistory(new Visitor("Alice","1",15,true,"Roller Coaster"));
        ride.checkVisitorFromHistory(new Visitor("Bob","2",10,true,"Roller Coaster"));

        //Print the number of visitors
        System.out.println("Number of visitors:" + ride.numberOfVisitor());

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
    }
    public void partSix(){
    }
    public void partSeven(){
    }
}