import java.math.BigInteger;
class Solution {
    public int solution(String number) {
        int answer = 0;
        BigInteger bigInteger = new BigInteger(number);
        BigInteger remainder = bigInteger.mod(BigInteger.valueOf(9));
        answer = remainder.intValue();
        return answer;
    }
}