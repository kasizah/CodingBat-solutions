public int[] make2(int[] a, int[] b) {
    int[] nums = new int[2];
    if(a.length > 0) {
        nums[0] = a[0];
        if(a.length > 1) {
            nums[1] = a[1];
            return nums;
        }
    }
    if(b.length > 0) {
        if(a.length == 1) {
            nums[1] = b[0];
            return nums;
        }
        nums[0] = b[0];
        nums[1] = b[1];
    }
    return nums;
}
