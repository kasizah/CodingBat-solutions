public int intMax(int a, int b, int c) {
  int greatest = (a >= b)? a : b;
  greatest = (greatest >= c)? greatest : c;
  return greatest;
}
