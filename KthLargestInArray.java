import java.util.PriorityQueue;

public class KthLargestInArray {
    
}

class Solution {
    public int findKthLargest(int[] nums, int k) {
        

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int ele : nums){

            if(pq.size()<k){
                pq.add(ele);
            }else{

                int peek = pq.peek();

                if(peek<ele){
                    pq.remove();
                    pq.add(ele);
                }
            }
        }

        return pq.peek();
    }
}
