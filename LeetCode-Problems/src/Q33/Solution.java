package Q33;

class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0) return -1;

        int left = 0;
        int right = nums.length-1;
        return binarySearch(nums,target,left,right);

    }

    private int binarySearch(int[] nums, int target, int left, int right) {
        if(left > right) return -1;
        int mid = left + (right - left) / 2;
        if(nums[mid] == target) return mid;
        if(nums[left] <= nums[mid]){
            if(nums[left] <= target && target < nums[mid]){
                return binarySearch(nums,target,left,mid-1);
            }else return binarySearch(nums,target,mid+1,right);
        }else{
            if(nums[mid] < target && target <= nums[right]){
                return binarySearch(nums,target,mid+1,right);
            }
            else return binarySearch(nums,target,left,mid-1);
        }
    }
}