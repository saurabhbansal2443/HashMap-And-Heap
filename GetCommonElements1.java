import java.util.HashMap;

public class GetCommonElements1 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,1,4,5,2,1,5};
        int[] arr2 = {1,2,3,1,2,2,2,2,4};

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<arr1.length;i++){

            int ele = arr1[i];

            if(hm.containsKey(ele)){
                hm.put(ele,hm.get(ele)+1);
            }else{
                hm.put(ele,1);
            }
        }

        for(int i=0;i<arr2.length;i++ ){
            
            int ele = arr2[i];

            if(hm.containsKey(ele)){

                System.out.println(ele);

                if(hm.get(ele)==1){
                    hm.remove(ele);
                }else{
                    hm.put(ele,hm.get(ele)-1);
                }
            }

        }


    }
}
