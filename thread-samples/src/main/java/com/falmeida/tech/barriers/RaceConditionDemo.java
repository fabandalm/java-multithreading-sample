package main.java.com.falmeida.tech.barriers;

public class RaceConditionDemo {

    public static void main(String args[]) throws InterruptedException  {
        // create 10 shoppers: Barron-0...4 and Olivia-0...4
        Shopper[] shoppers = new Shopper[10];
        for (int i=0; i<shoppers.length/2; i++) {
            shoppers[2*i] = new Shopper("Barron-"+i);
            shoppers[2*i+1] = new Shopper("Olivia-"+i);
        }
        for (Shopper s : shoppers)
            s.start();
        for (Shopper s : shoppers)
            s.join();
        System.out.println("We need to buy " + Shopper.bagsOfChips + " bags of chips.");
    }

}
