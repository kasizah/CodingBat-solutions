public int[] makeEnds(int[] nums) {
  int[] firstLast = new int[2];
  if(nums.length == 1) firstLast[0] = firstLast[1] = nums[0];
  else {firstLast[0] = nums[0]; firstLast[1] = nums[nums.length - 1];}
  return firstLast;
}
