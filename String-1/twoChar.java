public String twoChar(String str, int index) {
  return (index + 2 > str.length() || index < 0)? str.substring(0, 2) : str.substring(index, index + 2);
}
