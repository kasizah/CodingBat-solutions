public int[] reverse3(int[] nums) {
    int[] reversed = new int[nums.length];
    for(int i = nums.length-1; i >= 0; i--) {
        reversed[i] = nums[nums.length-1-i];
    }
    return reversed;
}
