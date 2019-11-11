public String everyNth(String str, int n) {
  String two = "" + str.charAt(0);
  for(int i = n; i < str.length(); i += n) {
    two += str.charAt(i);
  }
  return two;
}
