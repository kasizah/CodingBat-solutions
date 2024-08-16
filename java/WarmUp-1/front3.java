public String front3(String str) {
    if(str.length() < 3) return str + str + str;
    else {
        String f3 = str.substring(0, 3);
        return f3 + f3 + f3;
    }
}
