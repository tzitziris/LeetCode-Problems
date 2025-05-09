import binaryTrees.Binary_Tree_Inorder_Traversal_94;


//import javax.swing.tree.TreeNode;
import java.util.*;
//import binaryTrees.TreeNode;
//import util.TreeNode;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution3 {
    public String longestPalindrome(String s) {
        for (int length = s.length(); length > 0; length--) {
            for (int start = 0; start <= s.length() - length; start++) {
                if (check(start, start + length, s)) {
                    return s.substring(start, start + length);
                }
            }
        }

        return "";
    }

    private boolean check(int i, int j, String s) {
        int left = i;
        int right = j - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}

class Solution2 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> zigzag = new ArrayList<>();
        if (root == null) {
            return zigzag;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = false;

        while (!queue.isEmpty()) {

            int size  = queue.size();
            List<Integer> level = new ArrayList<>();
            Stack<Integer> reverseStack = new Stack<>();

            for (int i = 0; i < size; i++){
                TreeNode node = queue.poll();

                if (flag) {
                    reverseStack.add(node.val);
                } else {
                    level.add(node.val);
                }

                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }

            flag = !flag;

            while (!reverseStack.empty()) {
                level.add(reverseStack.pop());
            }

            zigzag.add(level);
        }
        return zigzag;
    }
}

class Solution4 {
    public int longestCommonSubsequence(String text1, String text2) {

        int[][] dp = new int[text1.length() + 1][text2.length() + 1];

        for (int i = 1; i <= text1.length(); i++)
            for (int j = 1; j <= text2.length(); j++)
                if (text1.charAt(i - 1) == text2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);

        return dp[text1.length()][text2.length()];
    }
}

public class Test {

    public static void main(String[] args) {
        // Constructing the binary tree:
        //         1
        //       /   \
        //      2     3
        //     / \   / \
        //    4   5 6   7

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        Solution2 solution = new Solution2();
        List<List<Integer>> result = solution.zigzagLevelOrder(root);

        // Print the result
        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }

}
