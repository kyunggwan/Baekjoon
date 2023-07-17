class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            answer += Character.getNumericValue(c[i]);
        }
        return answer;
    }
}
