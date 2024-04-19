import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        int size = s.length();
        int[] answer = new int[size];
                
   // 각 문자의 위치를 저장하는 맵을 생성합니다.
    Map<Character, Integer> indexes = new HashMap<>();        

        // 문자열을 왼쪽부터 순회합니다.
        for(int i = 0 ; i < size; i++ ){
        
            char c = s.charAt(i);
            // 해당 문자가 맵에 이미 등록되어 있는지 확인합니다.
            if(indexes.containsKey(c)){
                // 해당 문자가 등장한 위치를 가져옵니다.
                int prevIndex = indexes.get(c);
                // 현재 인덱스와 이전에 등장한 위치의 차이를 저장합니다.
                answer[i] = i - prevIndex;
             }
                // 해당 문자가 맵에 등록되어 있지 않다면 -1을 저장합니다.
                else {
                    answer[i] = -1;
                }
            
            // 현재 문자의 위치를 맵에 저장합니다.
            indexes.put(c, i);
            }
        
        return answer;
    }
}