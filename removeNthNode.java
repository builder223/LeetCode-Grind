//LeetCode Problem 19
/* ListNode class:
 public class ListNode {
        int val;
        ListNode next;
        
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 */

//Two pass solution (my first solution)
public class removeNthNode {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode pointer = head;

        int listSize = 0;

        if(head == null || (head.next == null && n == 1)){
            return null;
        }
        
        while(pointer != null){
            ++listSize;
            pointer = pointer.next;
        }

        if(listSize == n){
            head = head.next;
            return head;
        }

        pointer = head;
        int count = 0;

        while(pointer != null){
            if((count + 1) == (listSize - n)){
                pointer.next = pointer.next.next;
            }
            
            ++count;
            pointer = pointer.next;
        }

        return head;
    }
