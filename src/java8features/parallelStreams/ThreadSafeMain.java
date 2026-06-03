package java8features.parallelStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class ThreadSafeMain {

    public static void main(String[] args) throws InterruptedException {
//        List<Integer> numbers = new ArrayList<>();
//
//        for(int i=1;i<=1000;i++)
//        {
//            numbers.add(i);
//        }

//        List<Integer> squares = new ArrayList<>();
//
//        numbers.parallelStream()
//                .map(num -> num*num)
//                .forEach(num -> squares.add(num));

//        List<Integer> squares = numbers.parallelStream()
//                .map(num -> num * num)
//                .collect(Collectors.toList());
//
//        System.out.println(squares.size());






        System.out.println("----------------------ForkJoinPool-------------------------");

        List<Integer> numberss = Arrays.asList(1,2,3,4,5,6,7,8,9);

//        numberss.parallelStream()
//                .forEach(num -> System.out.println(Thread.currentThread().getName()));

        ForkJoinPool customThread = new ForkJoinPool(4);

        customThread.submit(()-> {
            numberss.parallelStream()
                    .forEach(num -> System.out.println(Thread.currentThread().getName()));

            });

        customThread.shutdown();
        customThread.awaitTermination(2, TimeUnit.SECONDS);
        }
}
