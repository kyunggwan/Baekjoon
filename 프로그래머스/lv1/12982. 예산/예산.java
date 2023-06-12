import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        // 배열 d를 정렬한다
        // 순회하면서 index를 출력한다
        Arrays.sort(d);
        for(int i = 0 ; i < d.length; i++){
            if(budget - d[i] >= 0){
                answer ++;
                budget -= d[i];
            }

        }
        return answer;
    }
}