package AS08.e02;

public class main {

    public static ChocolateShopManager shopManager = new ChocolateShopManager();
    public static void main(String[] args) {


        shopManager.createShop("Lidl",3,6,2,3);
        shopManager.createShop("Hofer",8,7,2,2);
        shopManager.createShop("Interspar",5,6,6,5);
        shopManager.createShop("Billa",4,6,3,4);
        shopManager.createShop("Mpreis",4,6,10,1);

        System.out.println("--------- Frage 1.----------");
        shopManager.printTotalAmount();
        System.out.println("--------- Frage 2.----------");
        shopManager.printAmountFavourite(ChocolateTypes.LINDT);

    }


}
