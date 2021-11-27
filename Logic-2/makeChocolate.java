// PREVIOUS SOLUTION -> DOESN'T WORK FOR ALL SOLUTIONS
/**
 *  public int makeChocolate(int small, int big, int goal) {
 *    int remainder = goal % 5;
 *    
 *    if(small + (big * 5) < goal) {
 *      return -1;
 *    } else if(remainder <= small && goal - (big * 5) > 4) {
 *      return remainder + 5;
 *    } else if(remainder <= small) {
 *      return remainder;
 *    } else {
 *      return -1;
 *    }
 *  }
 */
public int makeChocolate(int small, int big, int goal) {
  if(goal >= 5) {
    if(goal/5 >= big)
      goal -= big * 5;
    else
      goal %= 5;
  } 
  if(goal <= small) return goal;
  return -1;
}
