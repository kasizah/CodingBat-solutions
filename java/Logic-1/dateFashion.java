public int dateFashion(int you, int date) {
    return (you >= 8 && date > 2) || (you > 2 && date >= 8)? 
        2 : (
            (you <= 2 || date <= 2)? 0 : 1
        );
}
