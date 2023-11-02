import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] splitArray = myString.split("x");
        List <String> result = new ArrayList<>();
        
        for(String str : splitArray){
            if(!str.isEmpty()){
                result.add(str);
            }
        }
        
        String [] answer = result.toArray(new String[0]);
        
        Arrays.sort(answer);
        
        return answer;
    }
}