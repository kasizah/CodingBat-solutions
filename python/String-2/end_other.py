def end_other(a, b):
    aSub = a.lower()[len(a)-len(b):]
    bSub = b.lower()[len(b)-len(a):]
    return aSub == b.lower() or bSub == a.lower()
