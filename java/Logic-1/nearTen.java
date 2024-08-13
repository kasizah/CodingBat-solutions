public boolean nearTen(int num) {
  return num % 10 <= 2 || (num + 1) % 10 == 0 || (num + 2) % 10 == 0;
}
