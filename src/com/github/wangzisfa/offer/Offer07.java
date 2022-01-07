package com.github.wangzisfa.offer;

import java.util.HashMap;

public class Offer07 {
	int[] preorder;
	HashMap<Integer, Integer> map = new HashMap<>();
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		this.preorder = preorder;
		for (int i = 0; i < preorder.length; i++) {
			map.put(inorder[i], i);
		}

		return recursive(0, 0, preorder.length - 1);
	}
	//这道题实际上玩的就是前序和中序两个数组下标的关系
	//只要自己画图把关系理清楚了, 写起来就很容易了
	public TreeNode recursive(int root, int left, int right) {
		if (left > right) return null;
		//实际上是get到 inorder 数组中 root 的下标
		int i = map.get(preorder[root]);
		TreeNode node = new TreeNode(preorder[root]);

		node.left = recursive(root + 1, left, i - 1);
		node.right = recursive(root + i - left + 1, i + 1, right);
		return node;
	}
}


class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int val) {
		this.val = val;
	}
}