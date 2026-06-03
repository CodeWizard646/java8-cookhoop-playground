package java8features.streamAPI.primitiveStreamInterface;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class MainClass {

    public static void main(String[] args)
    {

        System.out.println("===============IntStream interface==============");

        // it will take elements: 1,2,3,4 NOT 5;
        IntStream intStream = IntStream.range(1, 5);
        int sum = intStream.sum();

        System.out.println(sum);


        System.out.println("===============DoubleStream interface==============");

        DoubleStream doubleStream = DoubleStream.of(2.3,4.5,7.1);
        System.out.println(doubleStream.average().getAsDouble());


        System.out.println("===============LongStream interface==============");

        LongStream longStream = LongStream.of(1,2,3);

    }
}
