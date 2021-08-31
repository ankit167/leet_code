// https://leetcode.com/problems/remove-one-element-to-make-the-array-strictly-increasing/
class Solution {
    // When we find two consecutive elements that are not strictly increasing, 
    // we have to remove one of them
    // T(n): O(n)
    public boolean canBeIncreasing(int[] nums) {
        int prev = nums[0];
        boolean used = false;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= prev) { // Not strictly increasing
                if (used) 
                    return false;
                used = true; // we haven't used the element removal yet
                
                // we remove the nums[i-1] because it's bigger, so we update prev.
                if (i == 1 || nums[i] > nums[i-2]) 
                    prev = nums[i];
                // else we remove the current element. no change in prev
            } else {
                prev = nums[i];
            }
        }
        
        return true;
        
    }
}
