public String stringBits(String str) {
  if(str.length() >= 0) {
    String everyOther = "";
    for(int i = 0; i < str.length(); i += 2) {
      everyOther += str.charAt(i);
    }
    return everyOther;
  }
  return "";
}
