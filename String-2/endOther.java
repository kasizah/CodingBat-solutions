public boolean endOther(String a, String b) {
  a.toLowerCase();
  b.toLowerCase();
  
  if(a.length() > b.length())
    return a.substring(a.length() - b.length()).equals(b);
  return b.subtring(b.length() - a.length()).equals(a);
}
