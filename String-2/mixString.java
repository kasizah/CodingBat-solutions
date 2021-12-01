public String mixString(String a, String b) {
  String mix = "", smaller, a2 = a, b2 = b;
  
  if(a.length() != b.length())
    smaller = (a.length() < b.length())? a : b;
  else
    smaller = a;
  
  for(int i = 0; i < smaller.length(); i++) {
    mix += a.substring(i, i + 1) + b.substring(i, i + 1);
    
    a2 = (i + 1 < a.length())? a.substring(i + 1) : "";
    b2 = (i + 1 < b.length())? b.substring(i + 1) : "";
  }
  
  return mix + a2 + b2;
}
