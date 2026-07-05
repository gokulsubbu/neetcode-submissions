class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
    
        map.put(nums[0],0);
        for(int i=1;i<n;i++){
            int diff=target-nums[i];
            if(map.containsKey(diff)){
                int ind2=i;
                int ind1=map.get(diff);
               return new int[]{ind1,ind2};
            }
              map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
