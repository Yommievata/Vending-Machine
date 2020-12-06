package Se.Lexicon;

import ProductsTypes.Product;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(java.lang.String[] args) {

        VendingMachine vendingMachine = new VendingMachinelmpl();
        vendingMachine .addMoney(100);
        vendingMachine.buy(200, 2);
        vendingMachine.getBalance();
        vendingMachine.returnChange();

    }

}
