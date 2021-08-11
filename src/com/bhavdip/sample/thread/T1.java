package com.bhavdip.sample.thread;

public class T1 implements Runnable {

    State s;
    public T1(State s) {
        this.s =s;
    }

    @Override
    public void run() {
        int i =1;

        while(i<50)
        {
            //System.out.println("s in t1 "+ s.getState());

            while(s.getState() != 3)
            {

                synchronized(s)
                {
                    try {
                        s.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                }

            }

            synchronized(s)
            {
                //if(s.getState() ==3)

                if(s.getState()==3)
                    System.out.println("t1 "+i);
                s.setState(1);
                i = i +3 ;
                s.notifyAll();


            }

        }

    }

}

