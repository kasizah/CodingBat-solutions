public int[] maxEnd3(int[] nums) {
    int max = (nums[2] > nums[0])? nums[2] : nums[0];
    for(int i = 0; i < nums.length; i++) {
        nums[i] = max;
    }
    return nums;
}
