class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aString = Integer.toString(a);
        String bString = Integer.toString(b);
        
        int temp1 = Integer.parseInt(aString + bString);
        int temp2 = Integer.parseInt(bString + aString);
        
        int temp3 = 2 * a * b;
        
        answer = Math.max(temp1, temp3);
        return answer;
    }
}