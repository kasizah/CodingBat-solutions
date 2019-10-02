public int[] rotateLeft3(int[] nums) {
  int[] rotated = new int[3];
  rotated[0] = nums[1];
  rotated[1] = nums[2];
  rotated[2] = nums[0];
  return rotated;
}
