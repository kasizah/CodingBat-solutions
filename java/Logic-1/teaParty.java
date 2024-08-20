public int teaParty(int tea, int candy) {
    if(tea >= 5 && candy >= 5) {
        return (tea >= candy*2 || candy >= tea*2)? 2 : 1;
    }
    return 0;
}
