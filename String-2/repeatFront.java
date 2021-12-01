public String repeatFront(String str, int n) {
  if(n > str.length()) return "";
  
  String fs = str.substring(0, n);
  
  String repeat = "";
  for(int i = 0; i < n; i++) {
    repeat += fs; fs = fs.substring(0, fs.length() - 1);
  }
  return repeat;
}
