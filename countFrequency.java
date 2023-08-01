import java.util.HashMap;

public class countFrequency {
    public static void main(String[] args) {
        int[] arr = {1,3,1,3,2,1,3,4,3,2,2,12,21};

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<arr.length;i++){

            int ele = arr[i];

            if(hm.containsKey(ele)==true){
                hm.put(ele,hm.get(ele)+1);
            }else{
                hm.put(ele,1);
            }
        }

        System.out.println(hm);
    }
}
