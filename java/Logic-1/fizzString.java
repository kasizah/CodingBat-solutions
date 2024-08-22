public String fizzString(String str) {
    String ret = "";

    // "Fizz" and "Buzz" can both be in the string.
    ret += (str.charAt(0) == 'f')? "Fizz" : "";
    ret += (str.charAt(str.length()-1) == 'b')? "Buzz" : "";

    if(ret.equals("")) {
        return str;
    }
    return ret;
}
