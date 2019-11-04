package org.sunrain.study.leetcode;

public class ListNode {

    int val;

    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public void display() {
        ListNode temp = this;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println();
    }
}
