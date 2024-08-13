// PREVIOUS SOLUTION -> DOES NOT WORK
/**
  *  public boolean closeFar(int a, int b, int c) {
  *    if(Math.abs(b - c) < 2) return false;
  *    return (close(a, b) && far(a, c)) || (close(a, c) && far(a, c));
  *  }
  *
  *  public boolean close(int x, int n) {
  *    return (Math.abs(x - n) <= 1)? true : false;
  *  }
  *
  *  public boolean far(int x, int n) {
  *    return (Math.abs(x - n) >= 2)? true : false;
  *  }
  */
public boolean closeFar(int a, int b, int c) {
  if(Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2) {
    return true;
  } else if(Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2) {
    return true;
  } else {
    return false;
  }
}
