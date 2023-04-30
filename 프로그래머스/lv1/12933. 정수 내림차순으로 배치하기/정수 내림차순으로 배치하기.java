import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        // string배열을 만들어서, long을 쪼개서 하나씩 넣음
        String [] arr = Long.toString(n).split("");
        // 역순으로 정렬
        Arrays.sort(arr, Collections.reverseOrder());
        
        // 배열에서 하나씩 출력해서 StringBuilder로 하나씩 붙인다
        // 위에서 역순으로 정렬했기에, 역순으로 붙는다
        StringBuilder sb = new StringBuilder();
        for(String s : arr){
            sb.append(s);
        }
        
        // answer은 Long타입이므로 그에 맞게 변형해서 넣음
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}