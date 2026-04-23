class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> mapNums = new HashMap<>();
        if(nums.length==0 || nums.length==1) {
            return false;
        }
        for (int i=0;i<nums.length; ++i) {
            if (!mapNums.containsKey(nums[i])) {
                mapNums.put(nums[i], 0);
            }
            else {
                return true;
            }
        }
        return false;
    }
}