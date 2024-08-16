public int[] front11(int[] a, int[] b) {
    int[] nums;
    if(a.length == 0 && b.length == 0) {
        nums = new int[0];
    } else if(Math.min(a.length, b.length) == 0) {
        nums = new int[1];
        if(a.length == 0) {
            nums[0] = b[0];
        } else {
            nums[0] = a[0];
        }
    } else {
        nums = new int[2]; 
        nums[0] = a[0]; 
        nums[1] = b[0];
    }
    return nums;
}
