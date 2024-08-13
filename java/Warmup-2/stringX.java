public String stringX(String str) {
  String result = "";
  if(str.length() <= 1) return str;
  for(int i = 1; i < str.length() - 1; i++) {
    result += str.charAt(i) != 'x'? str.charAt(i) : "";
  }
  result = str.charAt(0) + result + str.charAt(str.length() - 1);
  return result;
}
