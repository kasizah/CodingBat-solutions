public String altPairs(String str) {
  String result = "";
  for(int i = 0; i < str.length(); i += 4) {
    result += str.charAt(i) + "" + ((i + 1 > str.length() - 1)? "" : str.charAt(i + 1));
  }
  return result;
}
