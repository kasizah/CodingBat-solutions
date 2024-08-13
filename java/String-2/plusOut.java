public String plusOut(String str, String word) {
  String plussed = "";
  for(int i = 0; i < str.length() - word.length(); i++) {
    if(!str.substring(i, i + word.length()).equals(word)) {
      plussed += "+";
    } else {
      plussed += word; i += word.length() - 1;
    }
  }
  if(str.substring(str.length() - word.length()).equals(word))
    plussed += word;
  else if(str.substring(str.length() - word.length() - 1, str.length() - 1).equals(word))
    plussed += "+";
  else {
    for(int i = 0; i < word.length(); i++) plussed += "+";
  }
  return plussed;
}
