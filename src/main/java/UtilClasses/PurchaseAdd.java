package UtilClasses;

import MainClasses.Purchase;

import java.util.List;

public class PurchaseAdd extends Purchase {

    public PurchaseAdd(String title, int count) {
        super(title, count);
    }

    public PurchaseAdd(){}

    public boolean containsPurchase(String title, int count, List<Purchase> purchases) {
        for (Purchase purchase : purchases) {
            if (purchase.getTitle().equals(title)) {
                purchase.setCount(purchase.getCount() + count);
                return true;
            }
        }
        return false;
    }
}
