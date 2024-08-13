public int roundSum(int a, int b, int c) {
  return round10(a) + round10(b) + round10(c);
}

public int round10(int num) {
  int roundDown = (num / 10) * 10;
  int roundUp = ((num / 10)+1)*10;
  return (num % 10 >= 5)? roundUp : roundDown;
}
