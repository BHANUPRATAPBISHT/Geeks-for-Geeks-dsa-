/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
   int getKthFromLast(Node head, int k) {

    Node slow = head;
    Node fast = head;

    for(int i = 1; i <= k; i++) {
        if(fast == null) {   // ✅ FIX HERE
            return -1;
        }
        fast = fast.next;
    }

    while(fast != null) {
        slow = slow.next;
        fast = fast.next;
    }

    return slow.data;
}

}