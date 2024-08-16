public int diff21(int n) {
    int difference = (n > 21)? 2*(n - 21) : 21 - n;
    return difference;
}
