import java.util.*;

class Solution {
    public int[] solution(long n) {
        
    // 리스트에 10으로 나눈 나머지를 넣는다
        //배열에 넣어서 출력한다
    ArrayList <Integer> list = new ArrayList<>();
        while( n > 0){
            long a = n % 10;
            list.add((int)a);
            n /= 10;
        }
    int [] answer = new int [list.size()];
        for(int i = 0 ; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}