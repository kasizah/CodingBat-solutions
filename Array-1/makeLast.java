public int[] makeLast(int[] nums) {
  int[] aTwo = new int[nums.length * 2];
  aTwo[aTwo.length - 1] = nums[nums.length - 1];
  return aTwo;
}
