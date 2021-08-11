package com.bhavdip.sample.thread;

public class State {

    private int state ;

    public State() {
        this.state =3;
    }

    public synchronized int getState() {
        return state;
    }

    public synchronized void setState(int state) {
        this.state = state;
    }


}

