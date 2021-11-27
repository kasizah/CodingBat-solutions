public boolean catDog(String str) {
  int cat = 0, dog = 0;
  
  if(str.length() <= 3) {
    if(str.length() < 3) return true;
    else {
      return (str.equals("cat") || str.equals("dog"))? false : true;
    }
  }
  for(int i = 0; i < str.length() - 2; i++) {
    if(str.substring(i, i + 3).equals("cat")) cat++;
    if(str.substring(i, i + 3).equals("dog")) dog++;
  }
  return cat == dog;
}
