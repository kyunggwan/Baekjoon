class Solution {
    // a: 빈 병 숫자, b: 거슬러주는 병의 숫자, n: 시작하는 숫자
    // a개의 빈병을 주면 b개의 병을 거슬러 줌
    public int solution(int a, int b, int n) {
        int answer = 0; // 받은 빈병의 개수
        int number = n; // number: 안마신 콜라 개수
        
        while(number >= a){
            int empty_number = (number / a) * b; // 받은 빈병의 개수
            answer += empty_number; // 받은 병의 개수를 누적함
            
            number = number % a; 
            number += empty_number;
        }
        
        return answer;
    }
}