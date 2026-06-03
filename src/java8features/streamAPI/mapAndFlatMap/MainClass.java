package java8features.streamAPI.mapAndFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class MainClass {

    public static void main(String[] args){

        System.out.println("==================Map() method==========================");

//        List<String> names = List.of("Alice","Bob","Charlie");
//
//        List<String> upper = names.stream()
//                               .map(name->name.toUpperCase())
//                               .collect(Collectors.toList());
//
//        System.out.println(upper);

        System.out.println("==================flatMap() method==========================");

        List<List<String>> names = List.of(
                List.of("Alice","Bob"),
                List.of("Charlie","David")
        );

        List<String> flat = names.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println(flat);
    }
}
