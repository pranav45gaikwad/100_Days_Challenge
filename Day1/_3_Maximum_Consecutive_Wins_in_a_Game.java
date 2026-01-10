public class _3_Maximum_Consecutive_Wins_in_a_Game {
    
    public static void main(String[] args) {
        
        int[] nums = {1,1,0,1,1,1};
        int n = nums.length;
        int maxCount = 0;
        
        for (int i = 0; i < n; i++) {
            int currentCount = 0;
            for (int j = i; j < n; j++) {
                if (nums[j] == 1) {
                    currentCount++;
                    maxCount = Math.max(maxCount, currentCount);
                } else {
                    break;
                }
            }
        }
        
        System.out.println("max = "+maxCount);
    }
}
