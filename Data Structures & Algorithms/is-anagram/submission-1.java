class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap<Character,Integer> map=new HashMap<>();
       for(char ch : s.toCharArray()){
          map.put(ch,map.getOrDefault(ch,0)+1);
       }

       for(char ch : t.toCharArray()){
         if(map.containsKey(ch)){
            int n=map.get(ch)-1;
                map.put(ch,n);
         }
         else{
            map.put(ch,map.getOrDefault(ch,0)+1);
         }
       }

       for(Map.Entry<Character,Integer> set: map.entrySet()){
        int val=set.getValue();
          if(val<0 || val>0)return false;
       }

       return true;
    }
}
