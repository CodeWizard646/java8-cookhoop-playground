package coreJavaQandA.collectionKinderGarden;

import java.util.TreeMap;

public class TreeMapDemo
{
    public static void main(String[] args)
    {
        TreeMap map = new TreeMap();

        System.out.println("-------------TreeMap------------------");

//        map.put(106,"deepak");
//        map.put(103,"amit");
//        map.put(107,"kamal");
//        map.put(102,"deepesh");
//        map.put(108, "rahul");
//        map.put(101,"ravi");

        map.put("deepak",106);
        map.put("amit",103);
        map.put("kamal",107);
        map.put("deepesh",102);
        map.put( "rahul",108);
        map.put("ravi",101);

        System.out.println(map);


    }

}
