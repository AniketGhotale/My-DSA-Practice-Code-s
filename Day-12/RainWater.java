public class RainWater {

    public static void answer(int height[]){
        
        int  l=0, r=(height.length-1) ;
        int lmax = 0,  rmax = 0;
        int ans = 0;
        while (l < r) {
            lmax = Math.max(lmax , height[l]);
            rmax = Math.max(rmax, height[r]);
            if(lmax <= rmax){
                ans += lmax - height[l];
                l++;
            }else{
                ans += rmax - height[r];
                r--;
            }
        }
        System.out.println(ans);
    }
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        answer(height);
    }
}
