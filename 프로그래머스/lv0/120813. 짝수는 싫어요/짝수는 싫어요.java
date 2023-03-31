class Solution {
    public int[] solution(int n) {
        int[] answer; // 배열 선언
        int k =0;
        
        //크기가 n까지 홀수의 배열을 생성
        if( n % 2 == 0){
            answer = new int[n/2];        
        }
        else{
            answer = new int [n/2 + 1];
        }
        
        //n까지 숫자들 중에 홀수만 배열에 넣기
        for( int i = 0 ; i <= n; i++){
            if (i % 2 ==1){
                answer[k] = i;
                k++;
            }
         }

        return answer;
    }
}