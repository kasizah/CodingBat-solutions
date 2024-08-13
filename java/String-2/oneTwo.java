public String oneTwo(String str) {
  String strNew = "";
  for(int i = 0; i < str.length() - 3; i += 3) {
    String three = str.substring(i, i + 3);
    strNew += three.substring(1, 3) + three.substring(0, 1);
  }
  return strNew;
}
