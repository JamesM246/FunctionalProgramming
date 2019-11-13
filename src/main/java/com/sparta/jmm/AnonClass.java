package com.sparta.jmm;

public class AnonClass {    //Anonymous class example

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Creating thread in Anon class");
        }
    };

    private Runnable runnable1 = () -> System.out.println("Creating thread in lambda expression");

    public void runThread() {
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable1);
        thread.start();
        thread1.start();
    }
}
