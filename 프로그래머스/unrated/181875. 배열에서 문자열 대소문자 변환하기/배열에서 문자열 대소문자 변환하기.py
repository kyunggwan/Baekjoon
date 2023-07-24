def solution(strArr):
 return [
        string.lower()
        if i % 2 == 0
        else string.upper()
        for i, string in enumerate(strArr)
    ]