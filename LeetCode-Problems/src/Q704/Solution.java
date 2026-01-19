package Q704;


class Solution {
    public int search(int[] nums, int target) {
        return (bst(0, nums.length - 1, target, nums));
    }

    public int bst(int left, int right, int target, int[] nums) {

        if (left > right) return -1;

        int mid = (left + right) / 2;

        if (nums[mid] == target) return mid;
        else if (nums[mid] > target) {
            return bst(left, mid - 1, target, nums);
        } else {
            return bst(mid + 1, right, target, nums);
        }
    }
}