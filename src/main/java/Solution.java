public class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        long sum = 0;
        int freeAt = customers[0][0];
        for(int i = 0; i < n; i++) {
            int arrived = customers[i][0];
            int timeNeeded = customers[i][1];
            int wait = Math.max(0, freeAt - arrived) + timeNeeded;
            sum += wait;
            freeAt = Math.max(arrived, freeAt)  + timeNeeded;
        }
        return (double)sum / n;
    }
}
