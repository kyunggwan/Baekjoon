import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int [arr.length];
        
        // answer 배열에 주어진 배열 값 복사
        for(int i = 0 ; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        
        // 주어진 배열을 정렬
        Arrays.sort(arr);
        
        // 주어진 배열 길이가 1인 경우, -1을 리턴
        if(arr.length == 1) {
            answer[0] = -1;
        } else {
            // answer 배열에서 최소값과 같은 값이 있는 경우, 해당 값을 제거
            for(int i = 0 ; i < answer.length; i++) {
                if(answer[i] == arr[0]) {
                    // 최소값과 같은 값을 찾은 경우, 해당 요소를 삭제
                    for(int j = i; j < answer.length - 1; j++) {
                        answer[j] = answer[j+1];
                    }
                    answer = Arrays.copyOf(answer, answer.length - 1);
                    break;
                }
            }
        }
        
        return answer;
    }
}
