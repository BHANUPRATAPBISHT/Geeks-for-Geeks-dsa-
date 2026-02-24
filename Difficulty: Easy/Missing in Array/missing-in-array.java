class Solution {
    int missingNum(int arr[]) {
        // code here
        int i=0;
        int n=1+arr.length;
        while(i<arr.length)
        {
            if(arr[i]==i+1 || arr[i]==n)
            {
                i++;
            }
            else
            {
                int idx=arr[i]-1;
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
        return n;
    }
    public static void swap(int arr[],int idx,int i)
    {
        int temp=arr[i];
        arr[i]=arr[idx];
        arr[idx]=temp;
    }
}