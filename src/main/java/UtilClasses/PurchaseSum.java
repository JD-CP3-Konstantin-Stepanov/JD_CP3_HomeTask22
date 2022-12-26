package UtilClasses;

import MainClasses.Purchase;

import java.util.List;
import java.util.Map;

public class PurchaseSum {
    public long sum(Map<String, Integer> prices, List<Purchase> purchases) {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (Purchase purchase : purchases) {
            if (purchase == null) continue;
            System.out.println("\t" + purchase.getTitle() + " " + purchase.getCount() + " шт. в сумме "
                    + (purchase.getCount() * prices.get(purchase.getTitle())) + " руб.");
            sum += (long) purchase.getCount() * prices.get(purchase.getTitle());
        }
        return sum;
    }
}
