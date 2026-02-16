/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        if(head==null)
        {
            return head;
        }
        Node prev=null;
        Node curr=head;
        Node fast=curr.next;
        while(curr!=null)
        {
            fast=curr.next;
            curr.next=prev;
            curr.prev=fast;
            prev=curr;
            curr=fast;
        }
        return prev;
    }
}