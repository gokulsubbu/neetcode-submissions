class Node{
    int key;
    int value;
    Node(int key,int value){
        this.key=key;
        this.value=value;
    }
}
class MyHashMap {
     private final int ARRAY_SIZE=100;
     List<List<Node>> list;

    public MyHashMap() {
        list=new ArrayList<>(ARRAY_SIZE);
        for(int i=0;i<ARRAY_SIZE;i++){
            list.add(null);
        }
    }

    public void put(int key, int value) {
        int index=key%ARRAY_SIZE;
        if(list.get(index)==null){
            list.set(index,new ArrayList<>());
        }
         for(Node node:list.get(index)){
                if(node.key==key){
                    node.value=value;
                    return;
                 }
            }
            list.get(index).add(new Node(key,value));
         
    }
    
    public int get(int key) {
        int index=key%ARRAY_SIZE;
         if(list.get(index)!=null){
            for(Node node:list.get(index)){
                 if(node.key==key){
                    return node.value ;
                 }
            }
         }
         return -1;
    }
    
    public void remove(int key) {
         int index=key%ARRAY_SIZE;
         if(list.get(index)!=null){
           Iterator<Node> it = list.get(index).iterator();
                 while (it.hasNext()) {
                   if (it.next().key == key){
                      it.remove(); 
                 }
               }
            }
        }
}
/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */