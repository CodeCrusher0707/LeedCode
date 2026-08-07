class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivort=-1;

        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivort = i;
                break;
            }
        }

        if (pivort == -1){
            reverse(nums,0,n-1);
            return;
        }

        int nextGreater = -1;
        for (int i = n - 1; i > pivort; i--) {
            if (nums[i] > nums[pivort]) {
                nextGreater = i;
                break;
            }
        }
        
        swap(nums, pivort, nextGreater);

        reverse(nums, pivort + 1, n - 1);
    }
        
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}