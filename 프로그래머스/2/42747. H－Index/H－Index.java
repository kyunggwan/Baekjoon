import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        
        int hIndex = 0;
        int totalLength = citations.length;
        
        // citations 배열을 내림차순 정렬
        Arrays.sort(citations);
                
        // 배열을 검사 - 배열의 값이 count보다 큰지
        for(int i = 0 ; i < totalLength; i++){
            // 현재 인용횟수 이상인 논문의 수
            int count = totalLength - i;
            
            // H-Index 조건 검사
            if(citations[i] >= count){
                hIndex = count;
                break;
            }
            
        }
        return hIndex;
    }
}