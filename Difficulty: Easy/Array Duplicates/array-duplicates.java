class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
           int i=0;
      
        while(i<arr.length)
        {
            int idx=arr[i]-1;
            if(arr[i]==i+1 || arr[idx]==arr[i])
            {
                i++;
            }
            else
            {
                
                swap(arr,idx,i);
            }
        }
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=j+1)
            {
                ans.add(arr[j]);
            }
        }
        return ans;
    
    }
    public static void swap(int arr[],int idx,int i)
    {
        int temp=arr[i];
        arr[i]=arr[idx];
        arr[idx]=temp;
    }
}