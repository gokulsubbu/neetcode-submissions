class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int prefix=0;
        int res=0;
        for(int n : nums){
            prefix+=n;
            int diff=prefix-k;
            if(map.containsKey(diff)){
                res+=map.get(diff);
            }
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return res;
    }
}