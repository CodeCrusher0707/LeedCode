class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        int n= nums.length;
        if (n == 0) return result;
        
        Arrays.sort(nums);
        
        int start = nums[0];
        int end = nums[n - 1];
        int index = 0;

        for (int i = start; i <= end; i++) {
            if (index < nums.length && nums[index] == i) {
                index++;
            } else {
                result.add(i);
            }
        }
        
        return result;
    }
}