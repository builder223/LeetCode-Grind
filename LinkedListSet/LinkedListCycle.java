//LeetCode Problem 141

//My First Solution with implementation of HashSet/HashMap: Runtime is O(n) however O(n) for memory(bad)
public class LinkedListCycle {
   
    public boolean hasCycle(ListNode head) {
        ListNode pointer = head;  // pointer so we do not lose head;
        HashSet<ListNode> hash = new HashSet<ListNode>(); // record keeping based

        while(pointer != null){
            if(hash.contains(pointer)){ //once it loops one whole round and find a similar value it will return true;
                return true;
            }
            hash.add(pointer);
            pointer = pointer.next;
        }
        return false;      
    }
