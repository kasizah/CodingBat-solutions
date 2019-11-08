public boolean mixStart(String str) {
  if(str.length() >= 3) {
    return str.substring(1, 3).equals("ix");
  } else return false;
}
