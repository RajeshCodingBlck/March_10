//package Tree;
//
///**
// * Definition for a binary tree node.
// * public class TreeNode {
// *     int val;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode() {}
// *     TreeNode(int val) { this.val = val; }
// *     TreeNode(int val, TreeNode left, TreeNode right) {
// *         this.val = val;
// *         this.left = left;
// *         this.right = right;
// *     }
// * }
// */
//class Solution {
//    
//    public void Inorder(TreeNode root, ArrayList<Integer> arr){
//        
//        if(root==null){
//            return;
//        }
//        
//        Inorder(root.left, arr);
//        arr.add(root.val);
//        Inorder(root.right, arr);
//        
//    }
//    public boolean isValidBST(TreeNode root) {
//       
//        ArrayList<Integer> arr= new ArrayList();
//        Inorder(root, arr);
//        
//        for(int i=1; i<arr.size();i++){
//            
//            if(arr.get(i-1)>= arr.get(i)){
//                return false;
//            }
//        }
//        return true;
//        
//    }
//}
//public class VaidateBST {
//
//}
