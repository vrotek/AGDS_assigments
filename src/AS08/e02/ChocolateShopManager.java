package AS08.e02;

import java.util.*;

public class ChocolateShopManager {

    private Map<String, Map<ChocolateTypes, Integer>> shops = new HashMap<>();

    public ChocolateShopManager() {

    }

    public void createShop(String name, int bueno, int kinder, int lindt, int ferrero) {
        Map<ChocolateTypes, Integer> newShop = new HashMap<>();
        newShop.put(ChocolateTypes.BUENO, bueno);
        newShop.put(ChocolateTypes.KINDER_SCHOKOLADE, kinder);
        newShop.put(ChocolateTypes.LINDT, lindt);
        newShop.put(ChocolateTypes.FERRERO, ferrero);
        shops.put(name, newShop);
    }

    public Map<String, Map<ChocolateTypes, Integer>> getShops() {
        return shops;
    }

    public void printTotalAmount(){
        shops.keySet().stream().sorted().forEach((shop) -> {
            int total = 0;
            Map<ChocolateTypes, Integer> chocolate = shops.get(shop);
            for (int amount : chocolate.values()) {
                total += amount;
            }
            System.out.println(shop + ": " + total);
        });
    }

    public void printAmountFavourite(ChocolateTypes favourite){
        List<Map.Entry<String, Integer>> tripList = new ArrayList<>();

        for (Map.Entry<String, Map<ChocolateTypes, Integer>> entry : shops.entrySet()) {
            Map<ChocolateTypes, Integer> chocolates = entry.getValue();
            if (chocolates.containsKey(favourite)) {
                int amount = chocolates.get(favourite);
                tripList.add(new AbstractMap.SimpleEntry<>(entry.getKey(), amount));
            }
        }

        Collections.sort(tripList, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (Map.Entry<String, Integer> entry : tripList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
