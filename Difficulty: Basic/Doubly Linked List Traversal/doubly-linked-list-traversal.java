class Solution {
    public static ArrayList<Integer> displayList(Node head) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        Node temp = head;   // start from head
        
        while(temp != null) {
            result.add(temp.data);  // add current node data
            temp = temp.next;       // move to next node
        }
        
        return result;  // return the list
    }
}
