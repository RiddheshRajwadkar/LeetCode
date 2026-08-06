class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            while(nums[i] - nums[start] > 1) {
                start++;
            }
            if(nums[i] - nums[start] == 1){
                ans = Math.max(ans, i - start + 1);
            }
        }
    return ans;
    }
}