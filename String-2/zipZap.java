public String zipZap(String str) {
  char[] arr = new char[str.length()];
  int index = 0;
  
  int i = 0;
  while(i < str.length()) {
    if(i < str.length() - 2 && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
      arr[index] = 'z'; index++;
      arr[index] = 'p'; index++;
      i += 3;
    } else {
      arr[index] = str.charAt(i);
      index++; i++;
    }
  }
  return new String(arr, 0, count);
}
