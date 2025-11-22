public class Tries2 {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;
        int freq;
        public Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
            freq = 1;
        }
    }

    static Node root = new Node();


    public static void insert(String word){
        Node curr = root;
        for(int level=0; level<word.length(); level++){
            int idx = word.charAt(level) - 'a';

            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }else{
                curr.children[idx].freq++;
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }   

    public static boolean search(String key){
        Node curr = root;

        for(int level=0; level<key.length(); level++){
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }

        return curr.eow==true;
    }


    public static void findprefix(Node root, String ans){
        if(root == null){
            return;
        }

        if(root.freq == 1){
            System.out.print(ans + " ");
            return;
        }

        for(int level=0; level<26; level++){
            if(root.children[level] != null){
                findprefix(root.children[level], ans+(char)(level+'a'));
            }
        }
    }

    public static void main(String args[]){
        String words[] = {"zebre","dog","duck","dove"};

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        root.freq = -1;
        findprefix(root, "");
    }
}
