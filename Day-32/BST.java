import java.util.*;
public class BST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data < val)
        {
            root.right = insert(root.right, val);
        }else{
            root.left = insert(root.left, val);
        }

        return root;
    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static boolean search(Node root, int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }

        if(root.data < key){
            return search(root.right, key);
        }else{
            return search(root.left, key);
        }
    }

    public static Node findInordersucc(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static Node delete(Node root , int val){
        if(root == null){
            return null;
        }
        if(root.data > val){
            root.left = delete(root.left, val);
        }else if(root.data < val){
            root.right = delete(root.right, val);
        }else {

            //case 1
            if(root.left == null && root.right == null){
                return null;
            }

            //case 2
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            //case 3
            Node Is = findInordersucc(root.right);
            root.data = Is.data;
            root.right = delete(root.right, Is.data);
        }
        return root;
    }

    public static void printinorder(Node root, int n1, int n2){
        if(root == null){
            return;
        }

        if(root.data >= n1 && root.data <= n2){
            printinorder(root.left, n1, n2);
            System.out.print(root.data + " ");
            printinorder(root.right, n1, n2);
        }else if(root.data > n1){
            printinorder(root.left, n1, n2);
        }else {
            printinorder(root.right, n1, n2);
        }
    }

    public static void pathleaftoroot(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }

        path.add(root.data);
        if(root.left == null && root.right == null){
            for(int i=0; i<path.size(); i++){
                System.out.print(path.get(i) + "->");
            }
            System.out.println("null");
        }

        pathleaftoroot(root.left, path);
        pathleaftoroot(root.right, path);
        path.remove(path.size()-1);
    }

    public static boolean isValid(Node root, Node min, Node max){
        if(root == null){
            return true;
        }

        if(min != null && min.data >= root.data){
            return false;
        }

        if(max != null && max.data <= root.data){
            return false;
        }

        return isValid(root.left, min, root) && isValid(root.right, root, max);
    }


    public static Node createmirror(Node root){
        if(root == null){
            return null;
        }

        Node leftmirr = createmirror(root.left);
        Node rightmirr = createmirror(root.right);

        root.left = rightmirr;
        root.right = leftmirr;

        return root;
    }
    public static void main(String args[]){
        int values[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        preOrder(root);
        System.out.println();
        System.out.println(search(root,5));
        System.out.println();
        //root = delete(root, 1);
        preOrder(root);
        System.out.println();
        printinorder(root, 3, 7);
        System.out.println();
        pathleaftoroot(root, new ArrayList<>());
        System.out.println();
        System.out.println(isValid(root, null, null));
        System.out.println();
        preOrder(root);
        System.out.println();
        root = createmirror(root);
        preOrder(root);
    }

}