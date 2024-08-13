public String repeatEnd(String str, int n) {
  if(n > str.length()) return "";
  
  String ll = str.substring(str.length() - n, str.length());
  
  String repeat = "";
  for(int i = 0; i < n; i++) repeat += ll;
  
  return repeat;
}
