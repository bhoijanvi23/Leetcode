/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode AHead=new ListNode(0);
        ListNode A=AHead;
        ListNode BHead=new ListNode(0);
        ListNode B=BHead;
        while(head!=null){
            if(head.val<x){
                A.next=head;
                A=A.next;
            }else{
                B.next=head;
                B=B.next;
            }
            head=head.next;
        }
        B.next=null;
        A.next=BHead.next;
        return AHead.next;
    }
}