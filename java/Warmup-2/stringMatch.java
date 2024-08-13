public int stringMatch(String a, String b) {
  int shortest = Math.min(a.length(), b.length());
  int count = 0;
  
  for(int i = 0; i < shortest - 1; i++) {
    String aSub = a.substring(i, i + 2),
           bSub = b.substring(i, i + 2);
    if(aSub.equals(bSub)) count++;
  }
  return count;
}
