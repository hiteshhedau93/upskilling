public class ContainerWithMostWater {
    public static void main(String[] args) {
        int [] height = {1,7,2,5,4,7,3,6};
        System.out.println(maxArea(height));
    }

// public static int maxArea(int[] heights) {
    //     int ans = 0;
    //     for(int i=0;i<heights.length;i++){
    //          for(int j=i+1;j<heights.length;j++){
    //             int min = Math.min(heights[i],heights[j]);
    //             ans = Math.max(ans,(j-i)* min);
    //     }
    //     }
    //     return ans;
    // }

    public static int maxArea(int[] heights) {
        int p1=0;
        int p2 = heights.length-1;
        int ans = 0;
        while(p1<p2){
            int min = Math.min(heights[p1],heights[p2]);
            ans = Math.max (ans ,(p2-p1)* min);
            if(heights[p1]<heights[p2]){
                p1++;
            }else{
                p2--;
            }
        }
        return ans;
    }
}
