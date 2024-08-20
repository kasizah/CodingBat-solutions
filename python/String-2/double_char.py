def double_char(str):
    doubled = ""
    for i in range(len(str)):
        doubled += str[i] + str[i]
    return doubled
