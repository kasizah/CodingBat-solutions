public String getSandwich(String str) {
  int first = -1, last = -1;
  for(int i = 0; i < str.length() - 5; i++) {
    if(str.substring(i, i + 5).equals("bread")) {first = i; break;}
  }
  for(int i = str.length() - 5; i >= 0; i--) {
    if(str.substring(i, i + 5).equals("bread")) {last = i; break;}
  }
  if(first != last && first != -1 && last != -1)
    return str.substring(first + 5, last);
  else
    return "";
}
