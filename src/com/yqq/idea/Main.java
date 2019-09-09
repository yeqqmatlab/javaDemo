package com.yqq.idea;

import java.util.Date;

/**
 * Created by yqq on 2019/9/9.
 */
public class Main {

    public static void main(String[] args){
        for (int i = 0; i < 5; i++) {
            System.out.println(new Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        String s = new String("qqq");
        System.out.println(s);

        System.out.println("hello world");

    }
}
