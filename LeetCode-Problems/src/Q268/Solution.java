package Q268;

class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0;

        for (int i = 0; i<= nums.length; i++){
            xor ^= i;
        }

        for (int j = 0; j< nums.length; j++){
            xor ^= nums[j];
        }
        return xor;
    }
}