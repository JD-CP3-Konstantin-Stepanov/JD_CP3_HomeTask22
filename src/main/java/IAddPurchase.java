import java.util.ArrayList;
import java.util.List;

public interface IAddPurchase {
    List<Purchase> purchases = new ArrayList<>();

    static void addPurchase(String title, int count) {
        for (Purchase purchase : purchases) {
            if (purchase.getTitle().equals(title)) {
                purchase.setCount(purchase.getCount() + count);
                return;
            }
        }
        purchases.add(new Purchase(title, count));
    }
}
