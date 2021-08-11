package com.bhavdip.sample.thread;

public class T2 implements Runnable {

    State s;
    public T2(State s) {
        this.s =s;
    }

    @Override
    public synchronized void run() {
        int i =2;

        while(i<50)
        {

            while(s.getState() != 1)
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

                if(s.getState()==1)
                    System.out.println("t2 "+i);
                s.setState(2);
                i = i +3 ;
                s.notifyAll();

            }

        }




    }


}
