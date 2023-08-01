import java.util.HashMap;

public class LongestCommonSubsequence {
    
}

class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            hm.put(nums[i],false);
        }

        for(int k:hm.keySet()){


            int cont = k-1;

            if(hm.containsKey(k-1)==false){
                hm.put(k,true);
            }
        }

        int max = 0;

        for(int k:hm.keySet()){

                int currAns = 1;
            if(hm.get(k)==true){

                while(hm.containsKey(k+currAns)==true){
                    currAns++;
                }

            }

            max=Math.max(max,currAns);
        }

        return max;
    }
}
