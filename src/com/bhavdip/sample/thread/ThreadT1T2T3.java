package com.bhavdip.sample.thread;

public class ThreadT1T2T3 {
    public static void main(String[] args) {

        State s = new State();
        Thread t1 = new Thread(new T1(s));
        Thread t2 = new Thread(new T2(s));
        Thread t3 = new Thread(new T3(s));

        t1.start();
        t2.start();
        t3.start();

    }
}
