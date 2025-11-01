public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow. Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow. Cannot pop");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot peek");
            return -1;
        }
        return stackArray[top];
    }
    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
    
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Popped element: " + stack.pop()); 
        System.out.println("After pop, top element is: " + stack.peek());
    }
}
