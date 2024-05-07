import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Solution {
    public String solution(String s) {
        String answer = "";
        int size = 0;
        
        List<Integer> list = new ArrayList<>();
        
        StringTokenizer st = new StringTokenizer(s, " ");
        
        // list에 토큰을 넣음
        while(st.hasMoreTokens()){
            list.add(Integer.parseInt(st.nextToken()));
        }
        
        // list를 정렬
        Collections.sort(list);
        
        // 최소값과 최대값을 answer에 넣음
        answer = list.get(0) + " " + list.get(list.size() - 1);
        
        return answer;
    }
}