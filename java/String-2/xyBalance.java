public boolean xyBalance(String str) {
  boolean x = false, y = false;
  
  for(int i = 0; i < str.length(); i++) {
    if(str.charAt(i) == 'x' && y == true) {
      x = true;
      y = true;
    } else if(str.charAt(i) == 'x') {
      x = true;
    }
    if(str.charAt(i) == 'y' && x == true) {
      y = true;
    }
  }
  if(x == false)
    y = true;
  return y;
}
