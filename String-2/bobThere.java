public boolean bobThere(String str) {
  for(int i = 0; i < str.length() - 2; i++) {
    if(str.charAt(i) == str.charAt(i + 2) && str.charAt(i + 2) == 'b') return true;
  }
  return false;
}
