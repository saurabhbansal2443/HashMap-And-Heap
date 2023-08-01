import java.util.HashMap;

public class basics{
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("Gaurav",1);
         hm.put("Rahul",10);
         hm.put("Raju",2);
         hm.put("Ram",6);
         hm.put("Rahul",56);


        // System.out.println(hm.get("om")); // 0(1)

         //System.out.println(hm.containsKey("Raju")); // 0(1)

         //System.out.println(hm.containsValue(56)); // 0(n)

         //hm.remove("Raju"); // O(1)


        //  for(String s : hm.keySet()){  //o(n)
        //     System.out.println(s + "  " + hm.get(s));
            
        //  }

         for(int i : hm.values()){
            System.out.println(i);
         }



        //System.out.println(hm.size());
    }
}