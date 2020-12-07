package com.falmeida.tech.threads;

public class Multi extends Thread{

    @Override
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        Thread multi = new Thread();
        System.out.println(multi.getState());
        multi.start();
        System.out.println(multi.getState());
    }
}
