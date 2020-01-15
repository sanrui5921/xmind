package org.sunrain.study.leetcode;


/**
 * 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
 * <p>
 * 每行中的整数从左到右按升序排列。
 * 每行的第一个整数大于前一行的最后一个整数。
 * 示例 1:
 * <p>
 * 输入:
 * matrix = [
 * [1,   3,  5,  7],
 * [10, 11, 16, 20],
 * [23, 30, 34, 50]
 * ]
 * target = 3
 * 输出: true
 * 示例 2:
 * <p>
 * 输入:
 * matrix = [
 * [1,   3,  5,  7],
 * [10, 11, 16, 20],
 * [23, 30, 34, 50]
 * ]
 * target = 13
 * 输出: false
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/search-a-2d-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_0074 {

    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int lowX = 0, lowY = 0;

        int highX = matrix.length - 1;

        int targetX = -1;

        while (lowX <= highX) {

            int middleX = (lowX + highX) / 2;

            if (matrix[middleX].length == 0) {
                break;
            }

            if (matrix[middleX][0] <= target && target <= matrix[middleX][matrix[middleX].length - 1]) {
                targetX = middleX;
                break;
            }

            if (matrix[middleX][0] < target) {
                lowX = middleX + 1;
                continue;
            }

            if (matrix[middleX][0] > target) {
                highX = middleX - 1;
                continue;
            }
        }

        if (targetX == -1) {
            return false;
        }

        int targetY = -1;
        int highY = matrix[targetX].length - 1;

        while (lowY <= highY) {
            int middleY = (lowY + highY) / 2;
            if (matrix[targetX][middleY] > target) {
                highY = middleY - 1;
                continue;
            }
            if (matrix[targetX][middleY] < target) {
                lowY = middleY + 1;
                continue;
            }
            targetY = middleY;
            break;
        }

        if (targetY == -1) {
            return false;
        }

        return true;
    }
}
