class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int length = p.length();
        
        // p의 길이만큼 t를 나눠서 가져옴
        // p와 비교하여 작거나 같은 수만 카운트
        for(int i = 0 ; i < t.length() - length + 1; i++){
            long num = Long.parseLong(t.substring(i, i + length));
            if(num <= Long.parseLong(p)){
                answer ++;
            }
        }
        
        return answer;
    }
}