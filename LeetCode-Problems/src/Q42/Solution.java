package Q42;

class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length -1;

        int leftMax = height[left];
        int rightMax = height[right];
        int units = 0;

        while (left < right){
            if(height[left] < height[right]){
                leftMax = Math.max(leftMax, height[left]);
                if(leftMax > height[left]){
                    units+= leftMax - height[left];
                }
                left++;
            }else {
                rightMax = Math.max(rightMax, height[right]);
                if(height[right] < rightMax){
                    units+= rightMax-height[right];
                }
                right--;
            }
        }
        return units;
    }
}