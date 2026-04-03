class Solution {
    public int getSecondLargest(int[] arr) {
        int larg=0;
        int second=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>larg)
            {
                larg=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>second && arr[i]<larg)
            {
                second=arr[i];
            }
            
        }
        return second;
        
        // code here
        
    }
     
}