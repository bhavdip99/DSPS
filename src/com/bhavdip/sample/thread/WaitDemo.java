package com.bhavdip.sample.thread;

// Java program to demonstrate the use of wait() method
class GunFight {
    private int bullets = 40;

    // This method fires the number of bullets that are
    // passed it. When the bullet in magazine becomes zero,
    // it calls the wait() method and releases the lock.
    synchronized public void fire(int bulletsToBeFired) {
        for (int i = 1; i <= bulletsToBeFired; i++) {
            if (bullets == 0) {
                System.out.println(i - 1 + " bullets fired and " + bullets + " remains");
                System.out.println("Invoking the wait() method");
                try {
                    Thread.sleep(1000);
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Continuing the fire after reloading");
            }

            bullets--;
        }
        System.out.println("The firing process is complete");
    }

    // reload() increases the bullets by 40 everytime it is
    // invoked and calls the notify() method which wakes up
    // the thread that was sent to sleep using wait() inside
    // of fire() method
    synchronized public void reload() {
        System.out.println("Reloading the magazine and resuming the thread using notify()");
        bullets += 40;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        notify();
    }
}

public class WaitDemo extends Thread {
    public static void main(String[] args) {

        GunFight gf = new GunFight();

        // Creating a new thread and invoking
        // our fire() method on it
        new Thread(() -> gf.fire(60)).start();

        // Creating a new thread and invoking
        // our reload method on it
        new Thread(gf::reload).start();
    }
}