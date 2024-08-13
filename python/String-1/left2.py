def left2(str):
    if len(str) == 2:
        return str
    else:
        new = str[2:] + str[:2]
        return new
