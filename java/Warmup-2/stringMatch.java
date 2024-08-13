public int stringMatch(String a, String b) {
  int shortest = Math.min(a.length(), b.length()),
      count = 0;
  
  for(int i = 0; i < shortest - 1; i++) {
    if(a.substring(i, i+2).equals(b.substring(i, i+2))) count++;
  }
  return count;
}
