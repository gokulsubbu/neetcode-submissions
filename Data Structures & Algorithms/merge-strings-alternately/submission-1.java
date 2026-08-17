class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int i=0,j=0;                            // flag=false
        StringBuilder sb=new StringBuilder();  //abc   i=3
                                               //xyz   j=2
        while(i<n && j<m){                     //axbyc
           sb.append(word1.charAt(i++));
           sb.append(word2.charAt(j++));
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