class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        List<Integer> res=new ArrayList<>();
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if(m.getValue()>(nums.length/3)){
                res.add(m.getKey());
            }
        }

        return res;
    }
}