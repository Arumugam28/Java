import java.util.*;

class Task{
    String name;
    int priority;

    Task(String name,int priority){
        this.name=name;
        this.priority=priority;
    }

    public String toString(){
        return "Task: "+name+" (Priority: "+priority+")";
    }
}

public class AdvancelevelTask8{
    public static void main(String[] args){
        Comparator<Task> taskComparator=new Comparator<Task>(){
            public int compare(Task t1,Task t2){
                return t2.priority - t1.priority; 
            }
        };
        PriorityQueue<Task> taskQueue=new PriorityQueue<Task>(taskComparator);
        taskQueue.add(new Task("Write report",3));
        taskQueue.add(new Task("Attend meeting",5));
        taskQueue.add(new Task("Code review",2));
        taskQueue.add(new Task("Email clients",4));

        System.out.println("All tasks in PriorityQueue:");
        for(Task t:taskQueue){
            System.out.println(t);
        }

        System.out.println("\nTop Priority Task (peek): "+taskQueue.peek());

        System.out.println("\nRemoving top priority task...");
        taskQueue.remove();

        System.out.println("Remaining tasks after remove:");
        for(Task t:taskQueue){
            System.out.println(t);
        }
    }
}
