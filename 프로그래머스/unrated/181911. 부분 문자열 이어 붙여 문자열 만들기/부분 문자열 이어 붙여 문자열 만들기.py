def solution(my_strings, parts):
    result = []
    for i in range(len(my_strings)):
        s, e = parts[i]
        result.append(my_strings[i][s:e+1])
    return ''.join(result)

# 예제
my_strings = ["apple", "banana", "cherry"]
parts = [[1, 3], [2, 4], [0, 2]]
print(solution(my_strings, parts))  # 출력: pplbanche
