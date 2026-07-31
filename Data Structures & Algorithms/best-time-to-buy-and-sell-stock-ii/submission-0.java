class Solution {
    public int maxProfit(int[] prices) {
        
        int min=Integer.MAX_VALUE;
        int res=0;
        for(int n : prices){
            min=Math.min(n,min);
            int diff=n-min;
            if(diff>0){
                res+=diff;
                min=n;
            }
        }

        return res;
    }
}