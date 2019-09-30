public String startWord(String str, String word) {
  return (str.length() >= word.length() && str.substring(1, word.length()).equals(word.substring(1)))? str.substring(0, word.length()) : "";
}
