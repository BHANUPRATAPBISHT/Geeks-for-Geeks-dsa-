class Solution {
    public Node mergeSort(Node head) {

        // base case
        if (head == null || head.next == null)
            return head;

        // find middle
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // split list
        Node head2 = slow.next;
        slow.next = null;

        // recursive calls
        Node left = mergeSort(head);
        Node right = mergeSort(head2);

        // merge
        return sortedMerge(left, right);
    }

    public Node sortedMerge(Node head1, Node head2) {

        Node dummy = new Node(-1);
        Node tail = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }

        if (head1 != null)
            tail.next = head1;
        else
            tail.next = head2;

        return dummy.next;
    }
}
