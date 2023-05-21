class Solution {
    public String solution(String s) {
        String[] numbers = s.split(" ");
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (String num : numbers) {
            int current = Integer.parseInt(num);
            min = Math.min(min, current);
            max = Math.max(max, current);
        }
        
        String answer = String.valueOf(min) + " " + String.valueOf(max);
        return answer;
    }
}
