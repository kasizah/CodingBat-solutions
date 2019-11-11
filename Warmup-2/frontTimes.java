public String frontTimes(String str, int n) {
  String s = "", f3 = (str.length() >= 3)? str.substring(0, 3) : str;
  for(int i = 0; i < n; i++) s += f3;
  return s;
}
