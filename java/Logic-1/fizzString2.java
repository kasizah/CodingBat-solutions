public String fizzString2(int n) {
    String ret = "";
    ret += (n % 3 == 0)? "Fizz" : "";
    ret += (n % 5 == 0)? "Buzz" : "";
    if(ret.equals("")) {
        return n + "!";
    }
    return ret + "!";
}
