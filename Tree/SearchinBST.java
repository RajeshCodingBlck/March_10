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
//    public TreeNode searchBST(TreeNode root, int val) {
//        
//        if(root==null){
//           return null ;// According to Question  
//        }
//        if(root.val== val){
//            return root;
//        }else if(root.val<val){
//              
////            TreeNode rightans = searchBST(root.right, val);
////             return rightans;
//            return searchBST(root.right, val);
//            
//        }else{
//           
//             TreeNode leftans = searchBST(root.left, val);
//             return leftans;
//        }
//        
//        
//        
//        
//    }
//}
//public class SearchinBST {
//
//}
