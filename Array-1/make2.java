public int[] make2(int[] a, int[] b) {
  int[] arrayO2 = new int[2];
  if(a.length == 0) {arrayO2[0] = b[0]; arrayO2[1] = b[1]; return arrayO2;}
  if(a.length == 1) {arrayO2[0] = a[0]; arrayO2[1] = b[0]; return arrayO2;}
  else {arrayO2[0] = a[0]; arrayO2[1] = a[1]; return arrayO2;}
}
