class Solution {
    public int solution(int hp) {
        int answer = 0;
        int general = 0;
        int fighter = 0;
        int worker = 0;
                
        // 5로 나눌 수 있는 만큼 나누기
        while (hp >= 5) {
            hp -= 5;
            general++;
        }
        
        // 3으로 나눌 수 있는 만큼 나누기
        while (hp >= 3) {
            hp -= 3;
            fighter++;
        }
        
        // 나머지 체력에 대해서 worker 값을 증가
        worker += hp;
        
        answer = general + fighter + worker;
        return answer;
    }
}
