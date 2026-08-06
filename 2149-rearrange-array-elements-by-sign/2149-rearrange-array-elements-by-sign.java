class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n= nums.length;
        int[] a= new int[n/2];
        int[] b= new int[n/2];
        int x=0;
        int y=0;
        for(int i=0;i<n;i++){   
            if(nums[i]>0){
                a[x]=nums[i];
                x++;
            }
            else{
                b[y]=nums[i];
                y++;
            }
        }

        x=0;
        y=0;

        for(int j=0;j<n;j++){
           if(j%2==0){
            nums[j]=a[x];
            x++;
           } 
           else{
            nums[j]=b[y];
            y++;
           }
        }

        return nums;
    }
}