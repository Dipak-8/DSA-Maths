class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length - 2;
        while(low <= high) {
            // Calculate mid using right shift for efficiency: 
            // same as (low + high) / 2
            int mid = (low + high) >> 1;
            if(nums[mid] == nums[mid ^ 1])  // If mid is even, mid ^ 1 = mid + 1
                low = mid + 1;
            else                            // If mid is odd,  mid ^ 1 = mid - 1
                high = mid - 1;     
        }
        return nums[low];
    }
}