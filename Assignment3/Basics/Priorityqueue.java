import java.util.*;

class Task {
    String name;
    int priority;

    Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
    public String toString() {
        return name + " (Priority: " + priority + ")";
    }
}

public class Priorityqueue{
     public static void main(String[] args) {
        Comparator<Task> taskComparator = (t1, t2) -> Integer.compare(t2.priority, t1.priority);
        PriorityQueue<Task> taskQueue = new PriorityQueue<>(taskComparator);
        taskQueue.add(new Task("Write Report", 2));
        taskQueue.add(new Task("Attend Meeting", 5));
        taskQueue.add(new Task("Fix Bug", 3));
        taskQueue.add(new Task("Code Review", 4));
        System.out.println("All tasks in the queue: " + taskQueue);
        System.out.println("\nHighest Priority Task (peek): " + taskQueue.peek());
        System.out.println("\nRemoving Task: " + taskQueue.remove());
        System.out.println("Next Highest Priority Task (peek): " + taskQueue.peek());
        System.out.println("\nRemaining Tasks in Queue:");
        while(!taskQueue.isEmpty()) {
            System.out.println(taskQueue.remove());
        }
    }
}
