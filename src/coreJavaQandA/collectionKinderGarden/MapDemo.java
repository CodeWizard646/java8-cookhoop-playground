package coreJavaQandA.collectionKinderGarden;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args)
    {
        Map map = new HashMap();

        map.put(100,"deepak");
        map.put(200,"amit");
        map.put(300,"kamal");
        map.put(100,"Sudhanshu");
        map.put(null,null);
        map.put(null,null);

//        map.clear();

//        System.out.println(map.containsKey(103));

//        System.out.println(map.containsValue("kamal"));

//        System.out.println(map.get(200));

//        System.out.println(map.size());


        System.out.println(map);
    }
}
