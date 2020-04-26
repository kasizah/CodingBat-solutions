public int loneSum(int a, int b, int c) {
  int sum = (a != b && a != c)? a : 0;
  sum += (b != a && b != c)? b : 0;
  return (c != a && c != b)? sum + c : sum;
}
