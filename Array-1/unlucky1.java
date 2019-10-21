public boolean unlucky1(int[] nums) {
  boolean unlucky = false;
  if(nums.length < 2) unlucky = false;
  else {
    if(nums[0] == 1 && nums[1] == 3) unlucky = true;
    if(nums[1] == 1 && nums[2] == 3) unlucky = true;
    if(nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3) unlucky = true;
  }
  return unlucky;
}
