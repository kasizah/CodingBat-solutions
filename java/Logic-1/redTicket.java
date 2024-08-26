public int redTicket(int a, int b, int c) {
    if(a == b && b == c) {
        return (a == 2)? 10 : 5;
    }
    return (a != b && a != c)? 1 : 0;
}
