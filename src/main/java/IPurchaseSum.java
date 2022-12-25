import java.util.Map;

public interface IPurchaseSum {
    static long sum(Map<String, Integer> prices) {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (Purchase purchase : IAddPurchase.purchases) {
            if (purchase == null) continue;
            System.out.println("\t" + purchase.getTitle() + " " + purchase.getCount() + " шт. в сумме "
                    + (purchase.getCount() * prices.get(purchase.getTitle())) + " руб.");
            sum += (long) purchase.getCount() * prices.get(purchase.getTitle());
        }
        return sum;
    }
}
