class Solution {
    public int[] moveZeroes(int[] nums) {
        int n = nums.length;
        int count = 0; // Keep track of the position to place non-zero elements
        
        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // If the current element is non-zero, move it to the next available position
            if (nums[i] != 0) {
                nums[count] = nums[i];
                // If we moved the non-zero element to a new position, increment count
                if (i != count) {
                    nums[i] = 0; // Assign the current position with zero
                }
                count++;
            }
        }
        
        return nums;
    }
}
