public int noTeenSum(int a, int b, int c) {
  return fixTeen(a) + fixTeen(b) + fixTeen(c);
}

public int fixTeen(int n) {
  if(n >= 13 && n <= 19) {
    return (n == 15 || n == 16)? n : 0;
  } return n;
}
