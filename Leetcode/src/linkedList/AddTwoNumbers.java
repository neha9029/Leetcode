package linkedList;

public class AddTwoNumbers {


	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}

	class Solution {
		public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
			ListNode current1 = l1;
			ListNode current2 = l2;
			ListNode dummy = new ListNode(0);
			ListNode newList = dummy;

			StringBuilder sb = new StringBuilder();
			StringBuilder cb = new StringBuilder();
			sb.append(current1.val);
			cb.append(current2.val);
			while(current1.next != null){ 
				current1 = current1.next; 
				sb.append(current1.val);

			}

			while( current2.next != null){
				current2 = current2.next;
				cb.append(current2.val);

			}

			while(sb.length() < cb.length()){
				sb.append(0);
			}

			while(cb.length() < sb.length()){
				cb.append(0);
			}



			int sum = 0, k = 0, carry=0;
			String l = "";
			for(int i = 0; i<sb.length(); i++){
				sum = (cb.charAt(i) - '0') + (sb.charAt(i) - '0') + carry;    
				l += sum % 10 ; 
				carry = sum / 10;
			}
			if(carry != 0)
				l+=carry;


			dummy.val = (l.charAt(0) - '0');

			int j = 1;

			while(j<l.length() ){

				ListNode prev = new ListNode(0);
				prev.val = (l.charAt(j) - '0');
				dummy.next = prev;
				dummy = dummy.next;
				j++;
			}








			return newList;
		}
	}

}
