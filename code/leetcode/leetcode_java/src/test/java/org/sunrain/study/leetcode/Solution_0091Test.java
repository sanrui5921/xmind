package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0091Test {

    Solution_0091 solution;

    @Before
    public void init() {
        solution = new Solution_0091();
    }

    @Test
    public void numDecodingsTest1() {
        String str = "12";
        Assert.assertEquals(2, solution.numDecodings(str));
    }

    @Test
    public void numDecodingsTest2() {
        String str = "226";
        Assert.assertEquals(3, solution.numDecodings(str));
    }
}
