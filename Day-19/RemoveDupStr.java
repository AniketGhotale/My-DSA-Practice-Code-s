public class RemoveDupStr {
    
    public static void removeDup(String str, int idx,StringBuilder newstr , boolean map[]){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }

        char curr = str.charAt(idx);
        if(map[curr-'a'] == true){
            removeDup(str, idx+1, newstr, map);
        }else{
            map[curr-'a'] = true;
            removeDup(str, idx+1, newstr.append(curr), map);
        }
    }

    public static void main(String args[]){
        String str = "appnnacollegee";
        removeDup(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
