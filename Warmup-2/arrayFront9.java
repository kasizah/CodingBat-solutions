public boolean arrayFront9(int[] nums) {
  int end = nums.length;
  end = end > 4? 4 : end;
  
  for(int i = 0; i < end; i++) {
    if(nums[i] == 9) return true;
  }
  return false;
}
