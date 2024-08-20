public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
    if(isAsleep) return false;
    else {
        if(isMorning) {
            return isMom;
        }
        // not morning, not mom, not asleep
        return true;
    }
}
