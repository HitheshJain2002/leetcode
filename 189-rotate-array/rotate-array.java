class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] temp = new int[k]; // Change the size of temp array to k

        // Store the last k elements in the temp array
        for (int i = 0; i < k; i++) {
            temp[i] = nums[nums.length - k + i];
        }

        // Shift the remaining elements to the right
        for (int i = nums.length - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        // Place the elements from temp array to the beginning of nums
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}
