class Solution {
    public int maxArea(int[] height) {
        if(height.length<2) return 0;
        int right=height.length-1;
        int left=0;
        int maxarea=0;
        int area=0;
        while(left<right){
            if(height[left]<height[right]){
                area=height[left]*(right-left);
                left++;
            }else{
                area=height[right]*(right-left);
                right--;
            }
            if(area>maxarea) maxarea=area;
        }
        
        return maxarea;
    }
}