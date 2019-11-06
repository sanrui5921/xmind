package org.sunrain.study.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Solution_0094Test {

    Solution_0094 solution;

    @Before
    public void init() {
        solution = new Solution_0094();
    }

    @Test
    public void inorderTraversalTest1() {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);

        List<Integer> list = new ArrayList<Integer>();
        list.add(9);
        list.add(3);
        list.add(15);
        list.add(20);
        list.add(7);
        List<Integer> result = solution.inorderTraversal(node);
        System.out.println(result);
    }
}
