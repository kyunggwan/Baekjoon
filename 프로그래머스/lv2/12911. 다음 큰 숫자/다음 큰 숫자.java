class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // n을 2진 변환
        String s = Integer.toBinaryString(n);
        
        // 1의 갯수
        int numberOne = Integer.bitCount(n);
        
        // n과 1의 숫자 갯수가 같을때까지 증가
        while(true){
            n++;
            if(numberOne == Integer.bitCount(n)){
                answer = n;
                break;
            }
        }
        // 해당 숫자를 10진수로 변환
        return answer;
    }
}