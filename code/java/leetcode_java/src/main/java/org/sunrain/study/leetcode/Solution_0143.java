package org.sunrain.study.leetcode;


import java.util.Stack;

/**
 * 给定一个单链表 L：L0→L1→…→Ln-1→Ln ，
 * 将其重新排列后变为： L0→Ln→L1→Ln-1→L2→Ln-2→…
 * <p>
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 * <p>
 * 示例 1:
 * <p>
 * 给定链表 1->2->3->4, 重新排列为 1->4->2->3.
 * 示例 2:
 * <p>
 * 给定链表 1->2->3->4->5, 重新排列为 1->5->2->4->3.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reorder-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_0143 {

    public void reorderList(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }

        Stack stack = new Stack();

        for (ListNode current = head; current != null; current = current.next) {
            stack.push(current);
        }

        for (ListNode current = head; ; ) {
            ListNode nodePop = (ListNode) stack.pop();
            if (nodePop == current || current.next == nodePop) {
                break;
            }
            nodePop.next = current.next;
            current.next = nodePop;
            current = nodePop.next;
            nodePop = (ListNode) stack.pop();
            nodePop.next = null;
            stack.push(nodePop);
            head.display();
        }
    }
}
