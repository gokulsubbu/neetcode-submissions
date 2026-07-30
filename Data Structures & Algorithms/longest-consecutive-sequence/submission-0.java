class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
   int res=0;
        for(int n : set){
            if(!set.contains(n-1)){
                int len=0;
                while(set.contains(n)){
                     len++;
                      n++;
                res=Math.max(res,len);
             }
        }

    }
    return res;
}
}
