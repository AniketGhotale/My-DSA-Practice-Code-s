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

    public static int diameter(Node root){ //no of nodes in largest path
        if(root == null ){
            return 0;
        }

        int leftdia = diameter(root.left);
        int rightdia  = diameter(root.right);
        int leftht = height(root.left);
        int rightht = height(root.right);

        int selfdia = leftht + rightht + 1;

        return Math.max(selfdia, Math.max(rightdia, leftdia));
    }


    public static boolean isIdentical(Node root, Node subroot){
        if(root == null && subroot ==null){
            return true;
        }else if(root == null || subroot ==null || root.data != subroot.data){
            return false;
        }

        if(!isIdentical(root.left, subroot.left)){
            return false;
        }

        if(!isIdentical(root.right, subroot.right)){
            return false;
        }

        return true;
    }

    public static boolean isSubtree(Node root, Node subroot){
        if(root == null){
            return false;
        }

        if(root.data == subroot.data){
            if(isIdentical(root,subroot)){
                return true;
            }
        }

        boolean leftans = isSubtree(root.left, subroot);
        boolean rightans = isSubtree(root.right, subroot);

        return leftans || rightans;
    }


    static class Info {
        Node node;
        int hd;
        
        Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root){
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();
        int min=0;
        int max =0;

        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curinfo = q.remove();
            if(curinfo == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(!map.containsKey(curinfo.hd)){
                    map.put(curinfo.hd,curinfo.node);
                }

                if(curinfo.node.left != null){
                    q.add(new Info(curinfo.node.left, curinfo.hd-1));
                    min = Math.min(min, curinfo.hd-1);
                }

                if(curinfo.node.right != null){
                    q.add(new Info(curinfo.node.right, curinfo.hd+1));
                    max = Math.max(max, curinfo.hd+1);
                }
            }
        }

        for(int i=min; i<=max; i++){
            System.out.print(map.get(i).data + " ");
        }
    }
    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        //int nodes2[] = {2,3,-1,-1,4,-1,-1};
        Binarytreee tree = new Binarytreee();
        
        Node root = tree.builtTree(nodes);
        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);
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
        System.out.println("Diameter of Tree = " + diameter(root));
        System.out.println("Is subRoot is Subtree of Root " + isSubtree(root, subroot));
        topView(root);
    }
}