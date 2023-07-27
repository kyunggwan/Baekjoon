def solution(num_list):
    answer = 0
    even = ""
    odd = ""
    for i, num in enumerate(num_list):
        if num % 2 == 0:
            even += str(num)
        else:
            odd += str(num)

    answer = int(odd) + int(even)
    return answer