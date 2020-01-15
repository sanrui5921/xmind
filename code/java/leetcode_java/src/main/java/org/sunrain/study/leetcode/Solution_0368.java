package org.sunrain.study.leetcode;


import java.util.*;

/**
 * 给出一个由无重复的正整数组成的集合，找出其中最大的整除子集，子集中任意一对 (Si，Sj) 都要满足：Si % Sj = 0 或 Sj % Si = 0。
 * <p>
 * 如果有多个目标子集，返回其中任何一个均可。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3]
 * 输出: [1,2] (当然, [1,3] 也正确)
 * 示例 2:
 * <p>
 * 输入: [1,2,4,8]
 * 输出: [1,2,4,8]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/largest-divisible-subset
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_0368 {

    public List<Integer> largestDivisibleSubset(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> innerList = new ArrayList<>();
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] % nums[j] == 0 || nums[j] % nums[i] == 0) {
                    if (map.get(j).size() > innerList.size()) {
                        innerList = new ArrayList<>();
                        innerList.addAll(map.get(j));
                    }
                }
            }
            innerList.add(nums[i]);
            map.put(i, innerList);
        }

        int max = 0;
        List<Integer> result = new ArrayList<>();
        for (Integer key : map.keySet()) {
            if (map.get(key).size() > max) {
                result = map.get(key);
                max = map.get(key).size();
            }
        }

        return result;
    }
}
