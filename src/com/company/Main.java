package com.company;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Integer[] array = {1,2,6,9,21,32};
        Stream.of(array)
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .max(Integer::compare)
                .stream()
                .forEach(x -> System.out.println(x));

    }
}

