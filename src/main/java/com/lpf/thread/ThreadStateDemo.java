package com.lpf.thread;

/**
 * java线程状态
 *
 * @author lipengfei
 * @create 2018-05-18 11:13
 **/
public class ThreadStateDemo {



    public static void main(String[] args) {
        try {
            Thread.sleep(3000);
//            Thread.State.BLOCKED;

            Thread t = new Thread();
            System.out.println(t.getState());
            ThreadStateDemo obj = new ThreadStateDemo();

            synchronized (ThreadStateDemo.class){
//                while(!执行条件） {
//                    wait();
//                }
//
//                ....
//
//                if(!执行条件） {
//                    wait();
//                }
                obj.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
