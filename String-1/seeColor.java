public String seeColor(String str) { 
  String blueString = (str.length() >= 4 && str.substring(0, 4).equals("blue"))? "blue" : "";
  String redString = (str.length() >= 3 && str.substring(0, 3).equals("red"))? "red" : "";
  return blueString + redString;
}
