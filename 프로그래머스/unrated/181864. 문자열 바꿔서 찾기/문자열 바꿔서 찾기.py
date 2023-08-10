def solution(myString, pat):
    answer = 0
    transformed_string = ""
    
    for char in myString:
        if char == "A":
            transformed_string += "B"
        elif char == "B":
            transformed_string += "A"
    
    if pat in transformed_string:
        answer = 1
        
    return answer