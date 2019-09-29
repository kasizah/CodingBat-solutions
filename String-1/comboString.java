public String comboString(String a, String b) {
  String longer = (a.length() > b.length())? a : b;
  String shorter = (a.length() < b.length())? a : b;
  return shorter + longer + shorter;
}
