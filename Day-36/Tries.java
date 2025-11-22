public class Tries {

    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;
        public Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }

    static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int level=0; level<word.length(); level++){
            int idx = word.charAt(level) - 'a';

            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
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

    public static boolean wordbreak(String key){
        if(key.length() == 0){
            return true;
        }

        for(int level=1; level<=key.length(); level++){
            if(search(key.substring(0,level)) && wordbreak(key.substring(level))){
                return true;
            }
        }

        return false;
    }

    // public static void findprefix(Node root, String ans){
    //     if(root == null){
    //         return;
    //     }

    //     if(root.freq == 1){
    //         System.out.print(ans);
    //         return;
    //     }

    //     for(int level=0; level<26; level++){
    //         if(root.children[level] != null){
    //             findprefix(root.children[level], ans+(char)(level+'a'));
    //         }
    //     }
    // }

    public static boolean startwith(String prefix){
        Node curr = root;

        for(int level=0; level<prefix.length(); level++){
            int idx = prefix.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }

        return true;
    }

    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }

        int count = 0;
        for(int i=0; i<26; i++){
            if(root.children[i] != null){
                count += countNodes(root.children[i]);
            }
        }
        return count+1;
    }


    static String ans = "";
    public static void longestword(Node root, StringBuilder temp){
        if(root == null){
            return;
        }

        for(int i=0; i<26; i++){
            if(root.children[i] != null && root.children[i].eow == true){
                char ch = (char)(i+'a');
                temp.append(ch);
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longestword(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }

    public static void main(String[] args) {
        String words[] = {"the","a","there","their","any","thee"};

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
        String wordbreak = "theathere";
        System.out.println("is 'the' is present in Trie = " + search("the"));
        System.out.println();
        System.out.println("is 'theathere' is present in Trie = " + wordbreak(wordbreak));
        System.err.println();
        String prefix = "an";
        System.out.println("is 'an' is prefix in Trie = " + startwith(prefix));
        System.err.println();
        
        String str = "apple";
        for(int i=0; i<str.length(); i++){
            String suffix = str.substring(i);
            insert(suffix);
        }
        System.out.println("No of uniqu substring in "+str+" is = "+countNodes(root));
        System.err.println();
        System.err.println();

        String words1[] = {"a","app","banana","ap","appl","apply","apple"};
        for(int i=0; i<words.length; i++){
            insert(words1[i]);
        }
        longestword(root, new StringBuilder(""));
        System.out.println("Longest Word with all Prefix = "+ans);


    }
}