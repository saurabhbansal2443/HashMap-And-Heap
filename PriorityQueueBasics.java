import java.util.*;
public class PriorityQueueBasics {
    public static void main(String[] args) {

        int[] arr = {100,10,6,3,1,7};

        PriorityQueue<Integer> pq = new PriorityQueue<>();


        for(int i : arr){
            pq.add(i);
        }

        while(pq.size()>0){
            System.out.println(pq.remove());
        }


        //System.out.println(pq);
        
        
    }
}
