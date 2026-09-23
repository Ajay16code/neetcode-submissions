class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        boolean flag = false;

        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                    flag = true;
                }
            }
        }
        if(flag)
        {
            return true;

        }
        else
        {
            return false;
        }
    }
}