class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        int n= nums.length;
        if (n == 0) return result;
        
        Arrays.sort(nums);
        
       // int start = nums[0];
        //int end = nums[n - 1];
        //int index = 0;

        int i=0;
        int x=nums[0];
        while(i<n-1){
            x=x+1;
            if(x==nums[i+1]){
                i++;
            }
            else{
                result.add(x);
            }
        }
        
        return result;
    }
}