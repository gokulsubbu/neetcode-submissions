class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
    return 0;
}
        int left=0;
        int right=nums.length-1;
     
        while(left<right){
            while(left<nums.length && nums[left]!=val){
                left++;
            }

            while( right>0 && nums[right]==val ){
                right--;
            }

            if(left<right){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
            }
        }

        int count=0,i=0;
        while(i<nums.length && nums[i]!=val){
            count++;
            i++;
        }

        return count;
    }
}