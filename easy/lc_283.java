// https://leetcode.com/problems/move-zeroes/
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length, k=0, i=0, temp;
        
        while (i < n) {
            if (nums[i] != 0) {
                temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k++;
            }
            i++;
        }
    }
}
