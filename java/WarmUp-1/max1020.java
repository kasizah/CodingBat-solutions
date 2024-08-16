public int max1020(int a, int b) {
    // First make it so that the bigger value is in a
    if(b > a) {
        int temp = a;
        a = b;
        b = temp;
    }
    
    // Knowing a is bigger, check a first
    if(a >= 10 && a <= 20) return a;
    if(b >= 10 && b <= 20) return b;
    return 0;
}
