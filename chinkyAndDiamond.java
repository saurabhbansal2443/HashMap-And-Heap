import java.util.Collections;
import java.util.PriorityQueue;

public class chinkyAndDiamond {
    
}

class Solution {
    static long maxDiamonds(int[] arr, int n, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int ele : arr){
            pq.add(ele);
        }
        
        long sum = 0;
        
        while(k>0){
            int ele = pq.remove();
            sum+=(long)ele;
            
            pq.add(ele/2);
            k--;
        }
        return sum;
    }
};