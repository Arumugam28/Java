public class StackLinkedList {
    private Node top;
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
     public StackLinkedList() {
        top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
    public int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1; 
        }
        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1; 
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is " + stack.peek()); 

        System.out.println("Popped element is " + stack.pop());
        System.out.println("Popped element is " + stack.pop()); 

        System.out.println("Top element after popping is " + stack.peek());
    }
}
