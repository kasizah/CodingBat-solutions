public String fizzString2(int n) {
  int x = n % 3, y = n % 5;
  if(n % 3 == 0 && n & 5 == 0) return "FizzBuzz!";
  else if(n % 3 == 0 || x % 3 == 0) return "Fizz!";
  else if(n % 5 == 0 || y % 5 == 0) return "Buzz!";
  else return n + "!";
}
