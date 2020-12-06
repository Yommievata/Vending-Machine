package Se.Lexicon;

import ProductsTypes.Product;

import java.util.ArrayList;

public interface VendingMachine {

    boolean addMoney(int money);

    Product buy(int money, int prodNum);

    int returnChange();

    void presentProducts(ArrayList<Product> products);

    int getBalance();
    String [] getProduct();

}
