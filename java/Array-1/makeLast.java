public int[] makeLast(int[] nums) {
    int len2 = nums.length * 2;
    int[] array = new int[len2];

    /* Set last element of new array to last value
       of original array. */
    array[array.length-1] = nums[nums.length-1];
    
    return array;
}
