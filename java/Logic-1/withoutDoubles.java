public int withoutDoubles(int die1, int die2, boolean noDoubles) {
    if(noDoubles && die1 == die2) {
        die1 = (die1+1 == 7)? 1 : die1+1;
    }
    return die1 + die2;
}
