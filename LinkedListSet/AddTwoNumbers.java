//Linked List problem on LeetCode

/* ListNode class:

 public class ListNode {
        int val;
        ListNode next;
        
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 */

public class AddTwoNumbers{

  public ListNode addTwoNumbersClean(ListNode l1, ListNode l2){
        ListNode solHead = new ListNode(0), solPtr = solHead;
        int carry = 0;
        
        while (l1 != null || l2 != null || carry > 0) { 
            int sum = carry;
            if (l1 != null) sum += l1.val; // edge cases for unequal sized list; null values
            if (l2 != null) sum += l2.val;
            
            solPtr.next = new ListNode(sum % 10);
            solPtr = solPtr.next;
            
            if (l1 != null) l1 = l1.next; // edge cases for unequal size list; helps finish off a greater length linked list
            if (l2 != null) l2 = l2.next;
            
            carry = sum / 10;  // carry is what being 'carried' over; dividing by 10 brings addition that are > 10's remainder over to the next node
        }
        
        return solHead.next;   //O(n) runtime
    }
  
  
  
}
