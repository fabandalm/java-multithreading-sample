package main.java.com.falmeida.tech.barriers;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Shopper extends Thread{

    public static int bagsOfChips = 1; // start with one on the list
    private static Lock pencil = new ReentrantLock();

    public Shopper(String name) {
        this.setName(name);
    }

    public void run() {
        if (this.getName().contains("Olivia")) {
            pencil.lock();
            try {
                bagsOfChips += 3;
                System.out.println(this.getName() + " ADDED three bags of chips.");
            } finally {
                pencil.unlock();
            }
        } else { // "Barron"
            pencil.lock();
            try {
                bagsOfChips *= 2;
                System.out.println(this.getName() + " DOUBLED the bags of chips.");
            } finally {
                pencil.unlock();
            }
        }
    }

}
