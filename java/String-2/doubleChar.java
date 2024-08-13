public String doubleChar(String str) {
  String doubled = "";
  for(int i = 0; i < str.length(); i++) {
    doubled += str.substring(i, i + 1) + str.substring(i, i + 1);
  } return doubled;
}
