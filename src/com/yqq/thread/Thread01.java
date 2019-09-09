package com.yqq.thread;

/**
 * Created by yqq on 2019/9/7.
 */
public class Thread01 extends Thread{

    public Thread01(){
        System.out.println("AliveOtherThread--------begin");
        System.out.println("Thread.currentThread().getName=" + Thread.currentThread().getName());
        System.out.println("Thread.currentThread.isAlive()=" + Thread.currentThread().isAlive());
        System.out.println("this.getName()=" + this.getName());
        System.out.println("this.isAlive()=" + this.isAlive());
        System.out.println("AliveOtherThread--------end");
    }


    @Override
    public void run() {
        super.run();
        System.out.println("run---------begin");
        System.out.println("Thread.currentThread().getName=" + Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive()=" + Thread.currentThread().isAlive());
        System.out.println("this.getName()=" + this.getName());
        System.out.println("this.isAlive()=" + this.isAlive());
        System.out.println("run---------end");

    }

    public static void main(String[] args){

        Thread01 thread01 = new Thread01();
        thread01.run();

    }


}
