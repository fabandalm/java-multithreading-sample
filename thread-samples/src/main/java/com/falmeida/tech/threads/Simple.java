package com.falmeida.tech.threads;

public class Simple implements Runnable{
    public void run() {
        System.out.println("Runnable Thread");
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Simple simple = new Simple();
        Thread thread = new Thread(simple);
        thread.start();

    }

}
