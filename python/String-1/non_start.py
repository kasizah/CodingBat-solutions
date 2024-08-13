def non_start(a, b):
    if len(a) == 1:
        a = ""
    else:
        a = a[1:]

    if len(b) == 1:
        b = ""
    else:
        b = b[1:]

    return a + b
