import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    public void run() {
        //Given the root of a binary tree, return the inorder traversal of its nodes' values.

        System.out.println(solution(new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1, null, null),
                        new TreeNode(3, null, null)),
                new TreeNode(5,
                        null,
                        new TreeNode(6, null, null))
        ))); // 1, 2, 3, 4, 5, 6
    }

    List<Integer> ans = new ArrayList<>();

    private List<Integer> solution(TreeNode root) {
        if (root == null) {
            return ans;
        }
        solution(root.left);
        ans.add(root.val);
        return solution(root.right);
    }
}
