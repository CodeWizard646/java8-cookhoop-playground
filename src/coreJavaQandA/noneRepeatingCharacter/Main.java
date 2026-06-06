package coreJavaQandA.noneRepeatingCharacter;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args)
    {
        String str = "stress";

        Map<Character , Integer> map = new LinkedHashMap<>();

        for(char c : str.toCharArray()){
            map.put(c , map.getOrDefault(c , 0)+1);
        }

        for(Map.Entry<Character , Integer> e : map.entrySet()){
            if(e.getValue() == 1){
                System.out.println(e.getKey());
                break;
            }
        }
    }
}
