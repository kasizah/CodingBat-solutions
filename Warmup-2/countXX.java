int countXX(String str) {
  if(str.length() <= 2) return 0;
  else {
    int xxCnt = 0;
    for(int i = 0; i < str.length() - 1; i++) {
      if(str.substring(i, i + 2).equals("xx")) xxCnt;
    }
    return xxCnt;
  }
}
