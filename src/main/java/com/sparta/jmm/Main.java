package com.sparta.jmm;

public class Main {
    public static void main(String[] args){
//        Greeter standardGreeting = name -> "Hello " + name;
//        Greeter casualGreeting = name -> "Sup " + name;
//        Greeter formalGreeting = name -> "Good day to you " + name;

//        Greeting greeting = new Greeting();
//        String person = "James";
//        System.out.println(greeting.getGreeting(person,casualGreeting));
//        System.out.println(greeting.getGreeting(person,standardGreeting));
//        System.out.println(greeting.getGreeting(person,formalGreeting));
//        System.out.println(greeting.getGreeting(person, name -> "Hola " + name));


//        AnonClass anonClass = new AnonClass();
//        anonClass.runThread();

        Streams streams = new Streams();
//        streams.useForLoop();
        streams.useLambdas();
        streams.useLambdas1();
        streams.useLambdas2();
    }
}
