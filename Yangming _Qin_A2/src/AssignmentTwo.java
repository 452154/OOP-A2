public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignmentTwo = new AssignmentTwo();
        System.out.println("Part Three-------------------");
        assignmentTwo.partThree();

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
    }
    public void partFourB(){
    }
    public void partFive(){
    }
    public void partSix(){
    }
    public void partSeven(){
    }
}