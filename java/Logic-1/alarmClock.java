public String alarmClock(int day, boolean vacation) {
    if(vacation) {
        return (day >= 1 && day <= 5)? "10:00" : "off";
    } 
    return (day >= 1 && day <= 5)? "7:00" : "10:00";
}
