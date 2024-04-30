class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int totalDay = 0;
        int day = 0; 
        
        // 월, 일을 입력 받아 365일 중에 몇일인지 계산
       int[] daysOfMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
        
        for (int i = 0; i < a - 1; i++) {
            totalDay += daysOfMonth[i];
        }
        totalDay += b - 1;
        
        
        // 무슨 요일인지 출력
        day = totalDay % 7;
        switch(day){
            case 0:
                answer = "FRI";
                break;
            case 1:
                answer = "SAT";
                break;
            case 2:
                answer = "SUN";
                break;
            case 3:
                answer = "MON";
                break;
            case 4:
                answer = "TUE";
                break;
            case 5:
                answer = "WED";
                break;
            case 6:
                answer = "THU";
                break;
        }
        return answer;
    }
}