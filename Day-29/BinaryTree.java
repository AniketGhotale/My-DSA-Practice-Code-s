import java.util.*;
public class BinaryTree {

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

    static class Binarytreee {
        static int idx = -1;
        public static Node builtTree(int nodes[]){  
            idx++;

            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = builtTree(nodes);
            newNode.right = builtTree(nodes);

            return newNode;
        }        
    }
    

    public static void preOrder(Node root) {
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrder(Node root){
        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node curNode = q.remove();

            if(curNode == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(curNode.data + " ");
                if(curNode.left != null){
                    q.add(curNode.left);
                }
                if(curNode.right != null){
                    q.add(curNode.right);
                }
            }
        }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh,rh) + 1;
    }

    public static int NumberOfNodes(Node root){
        if(root == null){
            return 0;
        }

        int ln = NumberOfNodes(root.left);
        int rn = NumberOfNodes(root.right);

        return ln + rn + 1;
    }


    public static int sumofNodes(Node root){
        if(root == null){
            return 0;
        }

        int lsum = sumofNodes(root.left);
        int rsum = sumofNodes(root.right);

        return lsum + rsum + root.data;
    }
    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytreee tree = new Binarytreee();
        Node root = tree.builtTree(nodes);
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelOrder(root);
        System.out.println();
        System.out.println("Height = " + height(root));
        System.out.println("Number of Nodes = " + NumberOfNodes(root));
        System.out.println("Sum of Nodes = " + sumofNodes(root));
    }
}