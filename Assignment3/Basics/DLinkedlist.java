
class DoublyLinkedList<T extends Comparable<T>> {
    private class Node {
        T data;
        Node prev, next;
        Node(T data) { this.data = data; }
    }

    private Node head, tail;
    private int size = 0;

    public void add(T data) {
        Node newNode = new Node(data);
        if (head == null) head = tail = newNode;
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void remove(T data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                if (current.prev != null) current.prev.next = current.next;
                else head = current.next;
                if (current.next != null) current.next.prev = current.prev;
                else tail = current.prev;
                size--;
                return;
            }
            current = current.next;
        }
    }

    public T get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Invalid index");
        Node current = head;
        for (int i = 0; i < index; i++) current = current.next;
        return current.data;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void sort() {
        if (head == null) return;
        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            while (current.next != null) {
                if (current.data.compareTo(current.next.data) > 0) {
                    T temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
}

public class DLinkedlist {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(1);
        list.add(3);
        System.out.print("Original List: ");
        list.print();
        list.sort();
        System.out.print("Sorted List: ");
        list.print();
        list.remove(9);
        System.out.print("After Removing 9: ");
        list.print();
        System.out.println("Element at index 2: " + list.get(2));
    }
}
