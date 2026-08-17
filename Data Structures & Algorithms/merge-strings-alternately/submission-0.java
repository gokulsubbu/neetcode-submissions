class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int i=0,j=0;                            // flag=false
        StringBuilder sb=new StringBuilder();  //abc   i=3
        boolean flag=true;                     //xyz   j=2
        while(i<n && j<m){                     //axbyc
            if(flag){
              sb.append(word1.charAt(i));
              i++;
              flag=false;
            }
            else{
                 sb.append(word2.charAt(j));
                 j++;
                flag=true;
            }
        }

        while(i<n){
            sb.append(word1.charAt(i));
            i++;
        }
        while(j<m){
            sb.append(word2.charAt(j));
            j++;
        } 

        return sb.toString();         
    }
}