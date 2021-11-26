public int blackjack(int a, int b) {
  if(a > 21 && b > 21) return 0;
  /**
   * one value is less than 21
   * one value is more than 21
   */
  if(a > 21) return b;
  if(b > 21) return a;
  /**
   * both values are less than
   * or equal to 21
   */
  int winner = 0;
  if(a > b && a <= 21) winner = a;
  if(b > a && b <= 21) winner = b;
  return winner;
}
