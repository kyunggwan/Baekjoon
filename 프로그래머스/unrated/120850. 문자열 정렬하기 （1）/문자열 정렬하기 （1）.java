import java.util.*;
class Solution {
    public List<Integer> solution(String my_string) {
       List<Integer> numbers = new ArrayList<>();
        
        for(char c: my_string.toCharArray()){
            if(Character.isDigit(c)){
                numbers.add(Character.getNumericValue(c));
            }
        }
        Collections.sort(numbers);
        
        return numbers;
    }
}