public int loneSum(int a, int b, int c) {
    int sum = 0;

    sum += (a != b && a != c)? a : 0;
    sum += (b != a && b != c)? b : 0;
    sum += (c != a && c != a)? c : 0;

    return sum;
}
