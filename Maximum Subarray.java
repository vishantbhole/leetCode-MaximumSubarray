class Solution {
    public int maxSubArray(int[] nums) {

        int l = nums.length;
        int op = nums[0];
        int sum = 0;
        for(int i=0;i < l; i++){
            if(sum<0){
                sum = 0;
            }
            sum = sum +nums[i];
            op = Math.max(op,sum);

        }
        return op;
        
    }
}