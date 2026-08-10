class Solution {
    public boolean isPalindrome(String s) {
        
        char[] ch=s.toCharArray();
        int left=0;
        int right=ch.length-1;
        while(left<right){
            if(!(Character.isDigit(ch[left]) ||Character.isLetter(ch[left]))){
                left++;
                continue;
            }
              if(!(Character.isDigit(ch[right]) ||Character.isLetter(ch[right]))){
                right--;
                continue;
            }
            if(Character.toLowerCase(ch[left])!=Character.toLowerCase(ch[right])){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
