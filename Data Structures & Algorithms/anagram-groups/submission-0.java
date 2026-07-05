class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map=new HashMap<>();

        for(String str: strs){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String sorted=String.valueOf(ch);
            if(map.containsKey(sorted)){
                map.get(sorted).add(str);
            }
            else{
                map.put(sorted,new ArrayList<>());
                map.get(sorted).add(str);
            }
        }
        List<List<String>> res=new ArrayList<List<String>>();
        for(ArrayList<String> list:map.values()){
            res.add(list);
        }

        return res;
    }
}
