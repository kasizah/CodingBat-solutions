public String fizzString(String str) {
  char chF = str.charAt(0), chL = str.charAt(str.length() - 1);
  if(chF == 'f' && chL == 'b') return "FizzBuzz";
  else if(chF == 'f') return "Fizz";
  else return chL == 'b'? "Buzz" : str;
}
