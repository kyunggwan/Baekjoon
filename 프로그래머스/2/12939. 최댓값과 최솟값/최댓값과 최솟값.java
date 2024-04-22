import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";

        // s를 공백으로 구분하여 배열로 받음
        StringTokenizer st = new StringTokenizer(s);
        int size = st.countTokens(); 
        int [] arr = new int [size];
        
        for(int i = 0; i < size; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        // answer에 최대값과 최소값을 출력
        answer = arr[0] + " " + arr[size -1];
        
        return answer;
    }
}