public int[] frontPiece(int[] nums) {
    if(nums.length > 2) {
        int[] array = {nums[0], nums[1]};
        return array;
    }
    return nums;
}
