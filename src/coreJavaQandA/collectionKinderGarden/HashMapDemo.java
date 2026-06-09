package coreJavaQandA.collectionKinderGarden;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args)
    {
        HashMap<Integer, String> hm = new HashMap();

        hm.put(101,"deepak");
        hm.put(102,"amit");
        hm.put(103,"rahul");
        hm.put(104,"kamal");

        hm.put(105,"ravi");
        hm.put(106,"sudhanshu");

        hm.put(111,null);
        hm.put(222,null);
        hm.put(null,"aaa");

        hm.remove(103);

        System.out.println(hm.get(195));

        System.out.println(hm.size());

        System.out.println(hm);

        System.out.println(hm.containsKey(222));
        System.out.println(hm.containsKey("deepak"));


        for(Map.Entry me : hm.entrySet())
        {
            System.out.println(me.getKey()+ " -> " +me.getValue());
        }


//
//        Set set = hm.entrySet();

//        System.out.println(set);

//        Iterator itr = set.iterator();
//        while(itr.hasNext())
//        {
////            System.out.println(itr.next());
//            Map.Entry entry = (Map.Entry) itr.next();
//            System.out.println(entry.getKey()+ " -> " +entry.getValue());
//        }


    }
}
