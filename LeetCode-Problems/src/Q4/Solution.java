package Q4;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length == 0) return medianSingleArray(nums2);
        if(nums2.length == 0) return medianSingleArray(nums1);
        if(nums1.length > nums2.length)
            return findMedianSortedArrays(nums2, nums1);

        int x = nums1.length;
        int y = nums2.length;
        int start = 0, end = x;

        while(start <= end) {
            int partX = (start + end) / 2;
            int partY = (x + y + 1) / 2 - partX;

            int leftX = (partX == 0) ? Integer.MIN_VALUE : nums1[partX - 1];
            int rightX = (partX == x) ? Integer.MAX_VALUE : nums1[partX];

            int leftY = (partY == 0) ? Integer.MIN_VALUE : nums2[partY - 1];
            int rightY = (partY == y) ? Integer.MAX_VALUE : nums2[partY];

            if(leftX <= rightY && leftY <= rightX) {
                if((x + y) % 2 == 0)
                    return (Math.max(leftX, leftY) + Math.min(rightX, rightY)) / 2.0;
                else
                    return Math.max(leftX, leftY);
            }
            else if(leftX > rightY) {
                end = partX - 1;
            }
            else {
                start = partX + 1;
            }
        }
        return 0.0;
    }

    private double medianSingleArray(int[] nums) {
        int n = nums.length;
        if(n % 2 == 0)
            return (nums[n/2 - 1] + nums[n/2]) / 2.0;
        else
            return nums[n/2];
    }
}
