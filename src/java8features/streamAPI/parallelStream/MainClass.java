package java8features.streamAPI.parallelStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

    public static void main(String[] args){

        List<String> names = new ArrayList<>(Arrays.asList("Aman","Raj","Rohit","Riya",
                "Rahul","Ankit","Rina","Reshma"));

        names.parallelStream()
                .filter((str) -> str.startsWith("R"))
                .forEach((name) -> System.out.println(name));
    }
}
