package linkedList;


public class MiddleOfTheLinkedList {


	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	class Solution {
    public ListNode middleNode(ListNode head) {
        
        ListNode current = head;

        int count = 1;
        while(current.next != null){
            current = current.next;
            count++;
        }
        
        ListNode middle = head;
        int middleCount = count / 2;
      
        int i = 0;
        while(i < middleCount){
            middle = middle.next;
            i++;
        }

        return middle;
        
       
    }
    
	}
}
