class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxX = 0;
        int minY = 0;
        
        for(int i = 0 ; i < sizes.length; i++){
            int v = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);
            maxX = Math.max(v, maxX);
            minY = Math.max(h, minY);
        }
        return maxX * minY;
    }
}
