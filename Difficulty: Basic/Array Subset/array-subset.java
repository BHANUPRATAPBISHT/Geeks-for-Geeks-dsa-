
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele: a)
        {
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        
        for(int i=0;i<b.length;i++)
        {
            if(!map.containsKey(b[i]))
            {
                return false;
            }
            int frq=map.get(b[i]);
            if(frq==0)
            {
                return false;
            }
            else
            
            {
                map.put(b[i],frq-1);
            }
        }
        return true;
    }
}
