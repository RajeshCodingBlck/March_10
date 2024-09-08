//package MyHashFunction;
//
//class Solution {
//    public int maxFrequencyElements(int[] nums) {
//  // key(Value of Array)     value(fre)
//    HashMap<Integer, Integer> m= new HashMap<>();
//        
//    for(int i=0;i<nums.length;i++){ 
//        if(m.containsKey(nums[i])){  
//            int oldFre=m.get(nums[i]);
//            m.put(nums[i], oldFre+1);
//        }else{
//            m.put(nums[i],1);
//        }
//    }
//    
//        int maxFrequency=Integer.MIN_VALUE;
//        
//         int sum=0;
//        
//        for( int key: m.keySet()){
//           
//            int fre= m.get(key);
//            if(maxFrequency< fre){
//                maxFrequency=fre;
//                sum=maxFrequency;
//            }else if(maxFrequency==fre){
//                sum+=fre;
//            }
//        }
//       
//        
//        return sum;
//        
//           
//        
//    }
//}
//public class Question2_frequency {
//
//	
//
//}
