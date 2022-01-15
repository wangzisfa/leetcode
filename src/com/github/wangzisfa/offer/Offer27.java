package com.github.wangzisfa.offer;

import java.util.Stack;

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
    
    public TreeNode bfsBetter(TreeNode current) {
        if (current == null) return null;
        
        TreeNode temp = current.left;
        current.left = bfsBetter(current.right);
        current.right = bfsBetter(temp);
        
        return current;
    }
    
    // 辅助栈
    public TreeNode withStack(TreeNode current) {
        if (current == null) return current;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(current);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (current.left != null) stack.push(current.left);
            if (current.right != null) stack.push(current.right);
            // 这边再写的时候稍微有点看不懂, 感觉有点像是 node 暂存了当前节点的值
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
        
        return current;
    }
}
