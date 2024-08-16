public String startOz(String str) {
    if(str.length() >= 2) {
        if(str.substring(0, 2).equals("oz")) return "oz";
        else if(str.charAt(0) == 'o') return "o";
        else if(str.charAt(1) == 'z') return "z";
        else return "";
    } else if(str.length() >= 1) {
        return (str.charAt(0) == 'o')? "o" : "";
    } else {
        return "";
    }
}
