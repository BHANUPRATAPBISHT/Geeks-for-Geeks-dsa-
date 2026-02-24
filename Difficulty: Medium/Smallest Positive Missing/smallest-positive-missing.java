class Solution {
    public int missingNumber(int[] arr) {
        // code here
          int i=0;
        int n=arr.length;
        while(i<arr.length)
        {
             int idx=arr[i]-1;
            if
            (arr[i]==i+1 || arr[i]>n ||
            arr[i]<=0 || arr[idx]==arr[i] 
            )
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
                return j+1;
            }
        }
        return n+1;
    }
    public static void swap(int arr[],int idx,int i)
    {
        int temp=arr[i];
        arr[i]=arr[idx];
        arr[idx]=temp;
    
    }
}
