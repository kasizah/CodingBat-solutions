public int maxTriple(int[] nums) {
  int a = nums[0], b = nums[nums.length/2], c = nums[nums.length - 1];
  int max = (a > b || a == b)? a : b;
  max = (max > c || max == c)? max : c;
  return max;
}
