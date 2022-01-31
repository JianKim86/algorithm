import util.TreeNode;

public class SameTree {
    public void run() {
        //Given the roots of two binary trees p and q, write a function to check if they are the same or not.
        //Two binary trees are considered the same if they are structurally identical,
        //and the nodes have the same value.

        System.out.println(solution(new TreeNode(1,
                        new TreeNode(2), new TreeNode(3)),
                new TreeNode(1,
                        new TreeNode(2), new TreeNode(3))
        )); // true
    }

    private boolean solution(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val || !solution(p.left, q.left) || !solution(p.right, q.right)) {
            return false;
        }
        return true;
    }
}
