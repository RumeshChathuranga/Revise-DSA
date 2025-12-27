package Q217;
import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 0 || nums.length==1) return false;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums){
            if(set.contains(num)) return true;
            else set.add(num);
        }
        return false;
    }
}