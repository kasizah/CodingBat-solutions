public String delDel(String str) {
  if(str.length() < 4) {
    return str;
  } else if(str.indexOf("del") == 1) {
    return str.charAt(0) + str.substring(str.indexOf("del") + 3);
  } else {
    return str;
  }
}
