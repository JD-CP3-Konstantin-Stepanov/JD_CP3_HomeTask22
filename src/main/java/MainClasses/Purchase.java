package MainClasses;

import java.util.List;

public class Purchase {
    protected String title;
    protected int count;

    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public Purchase(){}

    public boolean containsPurchase(String title, int count, List<Purchase> purchases) {
        for (Purchase purchase : purchases) {
            if (purchase.getTitle().equals(title)) {
                purchase.setCount(purchase.getCount() + count);
                return true;
            }
        }
        return false;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public String getTitle() {
        return title;
    }
}
