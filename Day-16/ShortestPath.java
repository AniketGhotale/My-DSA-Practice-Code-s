public class ShortestPath {
    
    public static float shoetpath(String path){
        int x=0, y=0;
        for(int i=0; i<path.length(); i++){
            char ch = path.charAt(i);

            if(ch == 'E'){
                x++;
            }else if(ch == 'W'){
                x--;
            }else if(ch == 'N'){
                y++;
            }else{
                y--;
            }
        }

        int x2 = x*x;
        int y2 = y*y;

        return (float)Math.sqrt(x2+y2);
    }

    public static void main(String args[]){
        String str = "NSEEE";
        System.err.println(shoetpath(str));
    }
}
