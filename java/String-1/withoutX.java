public String withoutX(String str) {
  if(str.length() == 0) return str;
  else if(str.equals("x")) return "";
  else if(str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x') return str.substring(1, str.length() - 1);
  else if(str.charAt(0) == 'x') return str.substring(1);
  else if(str.charAt(str.length() - 1) == 'x') return str.substring(0, str.length() - 1);
  else return str;
}
