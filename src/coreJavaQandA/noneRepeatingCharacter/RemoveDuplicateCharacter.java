package coreJavaQandA.noneRepeatingCharacter;

import java.util.stream.Collectors;

public class RemoveDuplicateCharacter {

    public static void main(String[] args)
    {
        String str = "programming";

        String result =  str.chars()  // IntStream
                 .distinct()
                 .mapToObj(c -> String.valueOf((char)c))
                 .collect(Collectors.joining());

        System.out.println(result);
    }
}
