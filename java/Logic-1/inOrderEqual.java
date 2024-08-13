public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  if(equalOk) return a <= b && b <= c;
  else return a < b && b < c;
}
