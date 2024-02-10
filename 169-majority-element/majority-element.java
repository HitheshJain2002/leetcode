class Solution {
    public int majorityElement(int[] nums) {
        // Check if the array is empty or has only one element
        if (nums == null || nums.length == 0) {
            return -1; // Return -1 to indicate no majority element
        }
        if (nums.length == 1) {
            return nums[0]; // Return the only element as the majority element
        }
        
        // Initialize the candidate element and the count
        int candidate = 0;
        int count = 0;
        
        // Loop through the array to find the candidate element
        for (int num : nums) {
            if (count == 0) {
                // Update the candidate element and set the count to 1
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                // Increment the count if the current element is equal to the candidate
                count++;
            } else {
                // Decrement the count if the current element is different from the candidate
                count--;
            }
        }
        
        // Loop through the array again to verify the candidate element
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                // Count the frequency of the candidate element
                count++;
            }
        }
        
        // Check if the candidate element is the majority element
        if (count > nums.length / 2) {
            // Return the candidate element
            return candidate;
        } else {
            // Return -1 to indicate no majority element
            return -1;
        }
    }
}
