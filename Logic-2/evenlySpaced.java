public boolean evenlySpace(int a, int b, int c) {
  if(a == b && b == c) return true;
  int smallest = (a < b)? a : b; smallest = (smallest < c)? smallest : c;
  int middle = 0;
  if((a > b && a < c)||(a < b && a > c)) middle = a;
  if((b > a && b < c)||(b < a && b > c)) middle = b;
  if((c > a && c < b)||(c < a && c > b)) middle = c;
  int largest = (a > b)? a : b; largest = (largest > c)? largest : c;
  return Math.abs(smallest - middle) == Math.abs(middle - largest);
}
