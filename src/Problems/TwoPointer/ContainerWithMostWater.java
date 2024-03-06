package Problems.TwoPointer;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;

        while(l < r){
            int base = r-l;
            int h = Math.min(height[l],height[r]);
            max = Math.max(max,base*h);

            if(height[l]>height[r])
                r--;
            else{
                l++;
            }
        }

        return max;

    }
}
