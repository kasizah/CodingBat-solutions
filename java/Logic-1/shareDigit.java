public boolean shareDigit(int a, int b) {
    int aDiv = a / 10, aMod = a % 10,
        bDiv = b / 10, bMod = b % 10;

    return aDiv == bDiv || aDiv == bMod
        || aMod == bDiv || aMod == bMod;
}
