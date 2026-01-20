package Q153;

class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int left = 0;
        int right = nums.length - 1;
        int ans = Integer.MAX_VALUE;

        while (left <= right) {
            if (nums[left] < nums[right]) {
                ans = Math.min(ans, nums[left]);
            }
            int mid = left + (right - left) / 2;
            ans = Math.min(ans, nums[mid]);
            if (nums[left] > nums[mid]) {
                right = mid - 1;
            } else left = mid + 1;
        }
        return ans;
    }

}
