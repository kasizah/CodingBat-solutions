public int arrayCount9(int[] nums) {
  if(nums.length == 0) return 0;
  else {
    int count = 0;
    for(int i = 0; i < nums.length; i++) {
      count += nums[i] == 9? 1 : 0;
    }
    return count;
  }
}
