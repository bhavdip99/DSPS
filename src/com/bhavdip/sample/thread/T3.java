package com.bhavdip.sample.thread;

public class T3 implements Runnable {

    State s;

    public T3(State s) {
        this.s = s;
    }

    @Override
    public synchronized void run() {
        int i = 3;

        while (i < 50) {

            while (s.getState() != 2) {
                synchronized (s) {
                    try {
                        s.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                }

            }

            synchronized (s) {

                if (s.getState() == 2)
                    System.out.println("t3 " + i);
                i = i + 3;
                s.setState(3);
                s.notifyAll();
            }

        }


    }
}



