public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  if(isAsleep) return false;
  else {
    if(isMorning) return isMom? true : false;
    else return true;
  }
}
