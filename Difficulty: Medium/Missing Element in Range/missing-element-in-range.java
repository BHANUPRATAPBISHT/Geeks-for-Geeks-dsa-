class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        
        // Add array elements into set
        for(int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        
        // Check numbers from low to high
        for(int i = low; i <= high; i++) {
            if(!set.contains(i)) {
                ans.add(i);
            }
        }
        
        return ans;
    }
}
