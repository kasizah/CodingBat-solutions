public boolean inOrder(int a, int b, int c, boolean bOk) {
  if(bOk) return c > b;
  else return a < b && b < c;
}
