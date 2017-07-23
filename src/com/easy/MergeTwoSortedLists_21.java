package com.easy;

/**
 * Created by Yang on 2017/7/23.
 */


//Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.


public class MergeTwoSortedLists_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode sum;
        if(l1.val<l2.val){
            sum = l1;
            sum.next=mergeTwoLists(l1.next,l2);
        }else{
            sum = l2;
            sum.next=mergeTwoLists(l1,l2.next);
        }
        return sum;
    }
}
