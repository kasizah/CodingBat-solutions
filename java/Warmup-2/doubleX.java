boolean doubleX(String str) {
  return str.length() >= 2 && (str.substring(0, 2).equals("xx") || str.substring(1, 3).equals("xx"));
}
