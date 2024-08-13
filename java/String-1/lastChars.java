public String lastChars(String a, String b) {
  if(a.length() == 0 && b.length() == 0) return "@@";
  else if(a.length() == 0) return "@"+b.charAt(b.length() - 1);
  else if(b.length() == 0) return a.charAt(0)+"@";
  else return a.charAt(0) + "" + b.charAt(b.length() - 1);
}
