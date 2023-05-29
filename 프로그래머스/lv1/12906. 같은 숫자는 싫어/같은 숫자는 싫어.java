import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        // 배열을 List 에 넣는다
        List<Integer> list = new ArrayList<>();
    
        // List에서 바로 전의 숫자와 중복되는지 체크한다
        int preNum = -1;
        for(int num : arr){
            if(num != preNum){
                list.add(num);
                preNum = num;
            }
        }
        
        // List를 answer배열에 넣는다
        int [] answer = new int [list.size()];
        for(int i = 0 ; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}