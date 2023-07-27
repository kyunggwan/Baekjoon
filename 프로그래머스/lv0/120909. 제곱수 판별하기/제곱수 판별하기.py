import math
def solution(n):
    answer = 2
    num = math.sqrt(n)
    if num.is_integer():
        answer = 1
    return answer