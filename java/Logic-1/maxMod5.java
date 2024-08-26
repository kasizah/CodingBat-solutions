public int maxMod5(int a, int b) {
    if(a == b) return 0;
    if(a % 5 == b % 5) {
        return (a > b)? b : a;
    }
    return (a > b)? a : b;
}
