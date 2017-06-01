package cs115;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Created by icyhot on 31/05/2017.
 */
public class Checkout {

    ArrayList<DessertItem> desserts = new ArrayList<>();

    public void add(DessertItem d) {
        desserts.add(d);
    }

    public double totalCost() {
        double total = 0;
        for(DessertItem d : desserts) {
            total += d.calculateItemCost();
        }

        return total;
    }

    public void printReceipt() {
        System.out.println("Number of items: " + desserts.size() + "\n");
        for(DessertItem d : desserts) {
            System.out.printf("%.2f %s%n", d.calculateItemCost(), d.getName());
        }
        System.out.println("\nTotal cost: " + totalCost() + "\n");
    }
}
