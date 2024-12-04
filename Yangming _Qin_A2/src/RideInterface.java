public interface RideInterface {
    void addVisitorToQueue(Visitor visitor);
    void removeFromQueue(); // Define how to remove visitors from a queue.
    void printQueue(); // Print all information in the queue.
    void runOneCycle(); // Define the behavior of operating amusement facilities for one cycle.
    void addVisitorToHistory(Visitor visitor); // Record visitors in history.
    boolean checkVisitorFromHistory(Visitor visitor); // Check if the visitor is in history.
    int numberOfVisitor(); // Return the number of visitors in the history.
    void printRideHistory(); // Print history records.

}
