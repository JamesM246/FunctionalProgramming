package com.sparta.jmm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

    private List<String> towns = Arrays.asList("Brighton","Caterham","Worthing","Nottingham","Leeds","London");
    private Stream<String> townNames = towns.stream(); // Stream source

    public void useForLoop(){
        for(String name : towns){
            System.out.println(name);
        }
    }

    public void useLambdas(){
        towns.forEach(town -> System.out.println(town));
    }

    public void useLambdas1(){
        towns.forEach(System.out::println);
    }

    public void useLambdas2(){
        towns.stream()
                .map(String::toUpperCase)    //runs method on list but still returns stream
                .filter(town -> town.startsWith("L"))
                .forEach(System.out::println);
    }
}
