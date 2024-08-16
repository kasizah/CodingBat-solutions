public int[] makeEnds(int[] nums) {
    int[] ends = {nums[0], nums[0]};
    if(nums.length > 1) {
        ends[1] = nums[nums.length-1];
    }
    return ends;
}
