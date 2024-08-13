public int[] swapEnds(int[] nums) {
  int first = nums[0], last = nums[nums.length-1];
  nums[0] = last; nums[nums.length-1] = first;
  return nums;
}
