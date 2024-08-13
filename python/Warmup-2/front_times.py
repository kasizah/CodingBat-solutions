def front_times(str, n):
    front_len = 3
    if len(str) < front_len:
        front_len = len(str)
    front = str[:front_len]

    result = ""
    for i in range(n):
        result += front
    return result
