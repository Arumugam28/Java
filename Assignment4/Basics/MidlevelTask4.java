class Stack{
    int arr[];
    int top;
    int size;

    Stack(int size){
        this.size=size;
        arr=new int[size];
        top=-1;
    }

    void push(int value){
        if(top==size-1){
            System.out.println("Stack Overflow");
        }else{
            arr[++top]=value;
            System.out.println(value+" pushed to stack");
        }
    }

    void pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
        }else{
            System.out.println(arr[top]+" popped from stack");
            top--;
        }
    }

    void peek(){
        if(top==-1){
            System.out.println("Stack is empty");
        }else{
            System.out.println("Top element is: "+arr[top]);
        }
    }

    void display(){
        if(top==-1){
            System.out.println("Stack is empty");
        }else{
            System.out.print("Stack elements: ");
            for(int i=0;i<=top;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}

public class MidlevelTask4{
    public static void main(String args[]){
        Stack s=new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.peek();
        s.pop();
        s.display();
    }
}
