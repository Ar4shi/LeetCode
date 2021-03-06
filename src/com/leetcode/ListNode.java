package com.leetcode;

/**
 * 链表类
 *
 * @author jianghan
 * @date 2019-06-27 10:08
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public ListNode(Integer[] nums) {
        ListNode currNode = this;
        currNode.val = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currNode.next = new ListNode(nums[i]);
            currNode = currNode.next;
        }
    }

    @Override
    public String toString() {
        ListNode currNode = this;
        StringBuilder s = new StringBuilder();
        while (currNode != null) {
            s.append(currNode.val);
            s.append(" -> ");
            currNode = currNode.next;
        }
        // 最后添加一个 NULL 标志表示添加到末尾了
        s.append("NULL");
        System.out.println(s.toString());
        return s.toString();
    }
}
