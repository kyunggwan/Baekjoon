class Solution {
    public int solution(int n) {
     	// 한 판에 여섯 조각
    int pizzaBox = 6;
    // 같은 수로 나눠질 때까지 +6
    while(pizzaBox%n != 0) {
        pizzaBox+=6;
    } 
  	// 박스 수 반환
    return pizzaBox/6;
    }
}