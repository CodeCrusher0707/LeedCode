class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<Integer> result = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);

            if(map.get(num)>n/3 && !result.contains(num)){
                result.add(num);
                if(result.size()==2){
                    return result;
                }
            }
        }
        return result;      
    }
}