package org.sunrain.study.utils;

import org.sunrain.study.leetcode.ListNode;

public class ListNodeBuilder {
    public static ListNode build(String str) {
        if (str == null) {
            return null;
        }
        String[] arrays = str.split("->");
        ListNode head = new ListNode(Integer.parseInt(arrays[0]));
        ListNode temp = head;
        int length = arrays.length;
        for (int i = 1; i < length; i++) {
            temp.next = new ListNode(Integer.parseInt(arrays[i]));
            temp = temp.next;
        }
        return head;
    }
}
