package java8features.streamAPI.partitionAndGroupBy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ClassMain {

    public static void main(String[] args){


        System.out.println("==============PartitionBy()================");

        List<Integer> numbers = List.of(1,2,3,4,5,6);

        Map<Boolean , List<Integer>> partitioned =
                numbers.stream()
                        .collect(Collectors.partitioningBy(n -> n%2==0));

        System.out.println(partitioned);



        System.out.println("==============GroupingBy()================");

        List<String> names = List.of("Alice","Bob","charlie","David","Alex");

        Map<Character , List<String>> groupedBy =
                names.stream()
                        .collect(Collectors.groupingBy(name -> name.charAt(0)));

        System.out.println(groupedBy);

    }
}
