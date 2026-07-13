class Solution {

    class MyComparator implements Comparator<Map.Entry<Integer,Integer>>{
        @Override
        public int compare(Map.Entry<Integer,Integer> a ,Map.Entry<Integer,Integer> b){
            return a.getValue()-b.getValue();
        }
    }
    public int[] topKFrequent(int[] nums, int k) {

        //Finding freuency
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>(new MyComparator());

        for(Map.Entry<Integer,Integer> set:map.entrySet()){
                pq.add(set);
        if(pq.size()>k){
            pq.poll();
        }
     
        }
         
        int[] res=new int[pq.size()];
        for(int i=0;i<res.length;i++){
            res[i]=pq.poll().getKey();
        }
        return res;
    }
}
