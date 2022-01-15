package com.github.wangzisfa.offer;

/**
 * Description:
 * <p>
 * date: 2022/01/15
 * <p>
 *
 * @author wangzisfa
 */
public class Offer27 {
    public TreeNode mirrorTree(TreeNode root) {
        bfs(root);
        return root;
    }
    
    public void bfs(TreeNode current) {
        if (current == null) {
            return ;
        }
        TreeNode temp = current.left;
        current.left = current.right;
        current.right = temp;
        
        bfs(current.left);
        bfs(current.right);
    }
}
