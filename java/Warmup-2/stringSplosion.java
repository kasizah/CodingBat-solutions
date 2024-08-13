public String stringSplosion(String str) { 
  String increment = "";
  for(int i = 0; i < str.length(); i++) {
    for(int j = 0; j <= i; j++) {
      increment += str.charAt(j);
    }
  }
  return increment;
}
