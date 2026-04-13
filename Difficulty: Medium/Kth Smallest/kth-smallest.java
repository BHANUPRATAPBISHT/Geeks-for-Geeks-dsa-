class Solution {
    public int kthSmallest(int[] arr, int k) {

        int max = 0;

        for(int num : arr)
            max = Math.max(max, num);

        int[] freq = new int[max+1];

        for(int num : arr)
            freq[num]++;

        int count = 0;

        for(int i=0;i<freq.length;i++)
        {
            count += freq[i];

            if(count >= k)
                return i;
        }

        return -1;
    }
}