public String frontTimes(String str, int n) {
    String result = "", front3 = "";
    if(str.length() >= 3) {
        front3 = str.substring(0, 3);
    } else {
        front3 = str;
    }
    for(int i = 0; i < n; i++) {
        result += front3;
    }
    return result;
}
