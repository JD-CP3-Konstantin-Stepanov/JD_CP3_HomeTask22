import java.util.List;

public class IAddPurchase {

    static void addPurchase(String title, int count, List<Purchase> purchases) {
        for (Purchase purchase : purchases) {
            if (purchase.getTitle().equals(title)) {
                purchase.setCount(purchase.getCount() + count);
                return;
            }
        }
        purchases.add(new Purchase(title, count));
    }
}
