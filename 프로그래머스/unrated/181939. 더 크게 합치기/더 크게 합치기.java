class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int ab, ba;
        ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        ba = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        if (ab >= ba) answer = ab;
        if (ba > ab) answer = ba;
        return answer;
    }
}
