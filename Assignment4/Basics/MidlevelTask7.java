class Node{
    int data;
    Node left,right;

    Node(int value){
        data=value;
        left=right=null;
    }
}

class BinaryTree{
    Node root;

    void insert(int value){
        root=insertRec(root,value);
    }

    Node insertRec(Node root,int value){
        if(root==null){
            root=new Node(value);
            return root;
        }
        if(value<root.data)
            root.left=insertRec(root.left,value);
        else if(value>root.data)
            root.right=insertRec(root.right,value);
        return root;
    }

    void delete(int value){
        root=deleteRec(root,value);
    }

    Node deleteRec(Node root,int value){
        if(root==null)
            return root;

        if(value<root.data)
            root.left=deleteRec(root.left,value);
        else if(value>root.data)
            root.right=deleteRec(root.right,value);
        else{
            // Node with one or no child
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;

            // Node with two children: get inorder successor
            root.data=minValue(root.right);
            root.right=deleteRec(root.right,root.data);
        }
        return root;
    }

    int minValue(Node root){
        int min=root.data;
        while(root.left!=null){
            min=root.left.data;
            root=root.left;
        }
        return min;
    }

    boolean search(int value){
        return searchRec(root,value);
    }

    boolean searchRec(Node root,int value){
        if(root==null)
            return false;
        if(root.data==value)
            return true;
        return value<root.data?searchRec(root.left,value):searchRec(root.right,value);
    }

    void inorder(){
        inorderRec(root);
        System.out.println();
    }

    void inorderRec(Node root){
        if(root!=null){
            inorderRec(root.left);
            System.out.print(root.data+" ");
            inorderRec(root.right);
        }
    }
}

public class MidlevelTask7{
    public static void main(String args[]){
        BinaryTree tree=new BinaryTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.print("Inorder traversal: ");
        tree.inorder();

        System.out.println("Searching 40: "+tree.search(40));
        System.out.println("Searching 90: "+tree.search(90));

        tree.delete(20);
        System.out.print("After deleting 20: ");
        tree.inorder();

        tree.delete(30);
        System.out.print("After deleting 30: ");
        tree.inorder();
    }
}
