package Q15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans  = new ArrayList<>();
        Arrays.sort(nums);

        for(int i =0; i < nums.length -1 && nums[i] <= 0; i ++){
            if(i == 0 || nums[i] != nums[i-1]){
                twoSums(i, nums, ans);
            }
        }
        return ans;
    }

    public void twoSums(int i ,int[] nums, List<List<Integer>> ans){
        int target = nums[i] * -1;

        int left = i+1;
        int right = nums.length-1;
        while (left < right){
            if(nums[left]+nums[right] < target) left ++;
            else if (nums[left]+ nums[right] > target) right--;
            else {
                ans.add(Arrays.asList(nums[i], nums[left++], nums[right--]));
                while (left < right && nums[left] == nums[left-1]){
                    left++;
                }
            }

        }

    }
}