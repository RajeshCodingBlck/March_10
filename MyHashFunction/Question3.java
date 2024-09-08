//package MyHashFunction;
//
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//              // Array ki value, Indices
//        
//       HashMap<Integer, Integer> m= new HashMap();
//        
//        int [] ans= new int[2];
//        for(int i=0; i<nums.length;i++){
//            
//            int first=nums[i];
//            int second= target-nums[i];
//            
//            if(m.containsKey(second)){
//                
//                int firstIndex=i;
//                int secondIndex= m.get(second);
//                ans[0]=i;
//                ans[1]=secondIndex;
//                break;
//            }else{
//                
//                m.put(nums[i], i);
//            }
//        }
//        return ans;
//    }
//}
//public class Question3 {
//
//}
