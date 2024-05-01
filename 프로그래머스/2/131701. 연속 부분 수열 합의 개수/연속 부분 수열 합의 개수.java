import java.util.*;

class Solution {
    public int solution(int[] elements) {
   
        Set<Integer> answerSet = new HashSet<>();
        
        // 부분 수열을 순회
        for(int i = 1 ; i <= elements.length; i++){
            
            // 부분 수열의 위치 이동
            for(int j = 0; j < elements.length; j++){
                
            int count = 0;
            
                // 현재 위치 부터 수열까지의 원소 합
                for(int k = 0; k < i; k++){
                    
                    count += elements[(j + k) % elements.length];

                }
                answerSet.add(count);
            }
        }        
        
        
        return answerSet.size();
    }
    
}

