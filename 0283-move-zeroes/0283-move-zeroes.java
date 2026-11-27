class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        int a=0, b=0;
        int i=0;
        for ( ; i<nums.length; i++){
            if(nums[i]==0){
                b++;
                count++;
            }
            else{
                nums[a]=nums[b];
                a++;
                b++;
            }   
        }
        i = i - count;
        while(i<nums.length){
            nums[i]=0;
            i++;
        }
    }
}