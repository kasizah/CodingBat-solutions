public boolean xyzMiddle(String str) {
  if(str.length() < 3) return false;
  
  int f1 = str.length() / 2 - 2, f2 = str.length() / 2 - 1;
  if(str.length % 2 == 0)
    return str.substring(f1, f1 + 3).equals("xyz") || str.substring(f2, f2 + 3).equals("xyz");
  else
    return str.substring(f2, f2 + 3).equals("xyz");
}
