/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    boolean contains(TreeNode root, ListNode head){
        if(head == null){
            return true;
        }
        else if(root == null){
            return false;
        }
        else if(root.val == head.val){
            return contains(root.left, head.next) || contains(root.right, head.next);
        }
        return false;      
    
    }
    
    public boolean isSubPath(ListNode head, TreeNode root) {
       if(root == null ){
           return false;
       }
        return contains(root, head) || isSubPath(head, root.left) || isSubPath(head, root.right);
        
        
    }
}