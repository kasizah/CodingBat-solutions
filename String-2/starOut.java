public String starOut(String str) {
  if(str.length() < 1) return "";
  if(str.length() == 1) {
    return (str.charAt(0) == '*')? "" : str;
  }
  char[] arr = new char[str.length()];
  int index = 0;
  
  if(str.charAt(0) != '*' && str.charAt(1) != '*') {
    arr[index] = str.charAt(0); index++;
  }
  for(int i = 1; i < str.length() - 1; i++) {
    if(str.charAt(i - 1) != '*' && str.charAt(i) != '*' && str.charAt(i + 1) != '*') {
      arr[index] = str.charAt(i);
      index++;
    }
  }
  if(str.charAt(str.length() - 2) != '*' && str.charAt(str.length() - 1) != '*') {
    arr[index] = str.charAt(str.length() - 1);
    index++;
  }
  return new String(arr, 0, index);
}
