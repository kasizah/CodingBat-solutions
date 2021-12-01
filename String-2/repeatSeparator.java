public String repeatSeparator(String word, String sep, int count) {
  if(count == 0) return "";
  if(count == 1) return word;
  
  String repeated = "";
  for(int i = 0; i < count - 1; i++) {
    repeated += word + sep;
  }
  return repeated + word;
}
