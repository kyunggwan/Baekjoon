class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] token = binomial.split(" ");
        int num1 = Integer.parseInt(token[0]);
        int num2 = Integer.parseInt(token[2]);
        String cal = token[1];
        
        if(cal.equals("+")){
            answer = num1 + num2;
        } else if( cal.equals("-")){
            answer = num1 - num2;
        } else if( cal.equals("*")){
            answer = num1 * num2;
        }
        
        return answer;
    }
}