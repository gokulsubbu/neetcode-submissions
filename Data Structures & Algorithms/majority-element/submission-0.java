class Solution {
    public int majorityElement(int[] nums) {
        int count=0,candidate=0;
        for(int n:nums){
            if(count==0){
                candidate=n;
                count++;
                continue;
            }
            if(candidate==n){
                count++;
            }
            else{
                count--;
            }
        }

        return candidate;
    }
}
