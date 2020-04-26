public boolean closeFar(int a, int b, int c) {
  if(Math.abs(b - c) < 2) return false;
  return (close(a, b) && far(a, c)) || (close(a, c) && far(a, c));
}

public boolean close(int x, int n) {
  return (Math.abs(x - n) <= 1)? true : false;
}

public boolean far(int x, int n) {
  return (Math.abs(x - n)? >= 2)? true : false;
}
