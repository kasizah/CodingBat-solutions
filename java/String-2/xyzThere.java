/**
 * public boolean xyzThere(String str) {
 *  boolean xyzThere = false;
 *  
 *  if(str.length() < 3) return false;
 *  else {
 *    for(int i = 0; i < str.length() - 2; i++) {
 *      if(i != 0 && str.substring(i - 1, i + 3).equals(".xyz")) {
 *        xyzThere = false; break;
 *      }
 *      if(str.substring(i, i + 3).equals("xyz")) {
 *        xyzThere = true; break;
 *      }
 *    }
 *    return xyzThere;
 *  }
 * }
 */
public boolean xyzThere(String str) { 
  int len = str.length();
  String xyz = "xyz";
  
  boolean match = false;
  
  if(len < 3)
    return false;
  
  for(int i = 0; i < len - 2; i++) {
    String temp = str.substring(i, i + 3);
    if(temp.compareTo(xyz) == 0 && i == 0)
      match = true;
    else if(temp.compareTo(xyz) == 0 && str.charAt(i - 1) != 46)
      match = true;
  }
  return match;
}
