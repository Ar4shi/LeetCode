package com.leetcode.Solution101_200.Solution101_110;

import com.leetcode.TreeNode;

/**
 * 从前序与中序遍历序列构造二叉树
 *
 * @author jianghan
 * @date 2020-03-12 17:39
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal_105 {
    int[] preorder;
    int[] inorder;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;
        return null;
    }
}
