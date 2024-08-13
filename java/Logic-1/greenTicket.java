public int greenTicket(int a, int b, int c) {
  int lotto = 0;
  if(a != b && b != c && c != a) lotto = 0;
  if(a == b || b == c || c == a) lotto = 10;
  if(a == b && b == c) lotto = 20;
  return lotto;
}
