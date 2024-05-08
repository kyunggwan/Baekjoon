import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        int count = 0;
        int arrSize = 0;
        
        // 음식의 칼로리가 적은 순서대로 정렬
        // Arrays.sort(food);
        
        // arr 배열을 생성하여 값을 담아서 String 변환
        // 배열의 크기 및 중간값 입력
        for(int i = 1; i < food.length; i++ ){
            count += food[i] / 2;
        }
        
        arrSize = count * 2 + 1;
        
        int [] arr = new int [arrSize];
        arr[arrSize/2] = 0;
        
        // arr 배열에 맞는 값 입력
        int idx = 0;
        for(int i = 1; i < food.length; i++){
            
            int num = food[i] / 2;
            
            for(int k = 0; k < num; k++){
                arr[idx] = i;
                arr[arrSize - 1 - idx] = i;
                idx++;
            }
        }
        
        // arr 배열을 String 전환
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < arr.length; i ++){
            sb.append(arr[i]);
        }
                
        answer = sb.toString();
        return answer;
    }
}