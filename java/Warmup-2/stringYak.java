public String stringYak(String str) {
  String result = "";
  for(int i = 0; i < str.length(); i++) {
    if(i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i+2) == 'k') {
      i += 2;
    } else {
      result += str.charAt(i);
    }
  }
  return result;
}
