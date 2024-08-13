public int[] front11(int[] a, int[] b) {
  int[] a0b0;
  if(a.length == 0 && b.length == 0) a0b0 = new int[0];
  else if(a.length == 0 || b.length == 0){
    a0b0 = new int[1];
    if(a.length == 0 && b.length != 0) a0b0[0] = b[0];
    if(a.length != 0 && b.length == 0) a0b0[0] = a[0];
  }
  else {a0b0 = new int[2]; a0b0[0] = a[0]; a0b0[1] = b[0];}
  return a0b0;
}
