class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] a = new int[n];
        a[0]=1;
        int[] b = new int[n];
        b[n-1]=1;
        int[] answer = new int[n];

        for(int i=0;i<n-1;i++){
            a[i+1]=a[i]*nums[i];
        }
        for(int j=n-1;j>0;j--){
            b[j-1]=b[j]*nums[j];
        }

        for(int y=0;y<n;y++){
            answer[y]=a[y]*b[y];
        }

        return answer;
    }
}