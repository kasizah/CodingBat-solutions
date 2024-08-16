public int start1(int[] a, int[] b) {
    int count = 0;
    count += (a.length > 0 && a[0] == 1)? 1 : 0;
    count += (b.length > 0 && b[0] == 1)? 1 : 0;
    return count;
}
