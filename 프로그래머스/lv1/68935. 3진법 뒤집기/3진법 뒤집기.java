import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        
        // n을 3으로 나눈 나머지를 arr 배열에 넣는다.
        while(n > 0){
            list.add( n % 3 );
            n = n / 3;
            
        }
        // 3진법을 10진법으로 표현한다.
        int num = 0;
        for(int i = list.size()-1 ; i >= 0 ; i--){
            answer += list.get(i) * Math.pow(3,num);         num ++;
        }
        
        
        return answer;
    }
}