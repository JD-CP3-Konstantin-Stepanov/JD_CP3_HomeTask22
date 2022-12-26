package UtilClasses;

import MainClasses.Purchase;

import java.util.List;

public class PurchaseAdd {

    public void add(String title, int count, List<Purchase> purchases) {
        for (Purchase purchase : purchases) {
            if (purchase.getTitle().equals(title)) {
                purchase.setCount(purchase.getCount() + count);
                return;
            }
        }
        purchases.add(new Purchase(title, count));
    }
}
