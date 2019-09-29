public String minCat(String a, String b) {
  String isLonger = (a.length() > b.length())? a.substring(a.length() - b.length()) : b.substring(b.length() - a.length());
  String isShorter = (a.length() < b.length())? a : b;
  return (a.length() == b.length())? a + b : ((isShorter == a)? isShorter + isLonger : isLonger + isShorter);
}
