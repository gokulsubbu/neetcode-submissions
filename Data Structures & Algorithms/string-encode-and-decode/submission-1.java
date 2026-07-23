class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String str:strs){         // ["hello","world"]
            int len=str.length();      // len=5
            sb.append(len);
            sb.append("#");
            sb.append(str);
      

        }
        return sb.toString();               //5#hello5#world
    }

    public List<String> decode(String str) {
         
         List<String> list=new ArrayList<>();    //  [ ]
         int n=str.length(),i=0;
         while(i<n){                              // i=8
            int len=0;                            //len=0
            while(str.charAt(i)!='#'){
                 len=len*10+(str.charAt(i)-'0');
                 i++;
            }
            i++;
            String temp=str.substring(i,i+len); 
            i=i+len;    //
            list.add(temp);
         }
 return list;

    }
}
