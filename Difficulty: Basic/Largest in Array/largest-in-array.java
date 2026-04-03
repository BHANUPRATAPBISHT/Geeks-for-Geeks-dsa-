class Solution {
    public static int largest(int[] arr) {
        int larg=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>larg)
            {
                larg=arr[i];
            }
        }
        return larg;
        // code here
        
    }
}
