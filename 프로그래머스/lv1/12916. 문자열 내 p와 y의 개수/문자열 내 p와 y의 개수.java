class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countP = 0;
        int countY = 0;

        // 문자열 s를 소문자로 변환
        s = s.toLowerCase();
       
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == 'p') countP++;
            if(s.charAt(i) == 'y') countY++;
        }
        // 만약 p, y가 하나도 없으면 true를 출력
        if(countP == 0 && countY == 0){
            answer = true;
        } else {
             // p, y의 갯수를 비교해서 같으면 true를 출력
            if(countP == countY){
                answer = true;
               // 다르면 false를 출력
            } else{
                answer = false;
            }
        }
        return answer;
    }
}
