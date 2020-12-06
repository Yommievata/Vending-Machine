package Se.Lexicon;

import ProductsTypes.Product;

import java.util.ArrayList;

public class UserInterface {
    public static void main(java.lang.String[] args) {
        VendingMachine vendingMachine = new VendingMachine() {
            @Override
            public boolean addMoney(int money) {
                return false;
            }

            @Override
            public Product buy(int money, int prodNum) {
                return null;
            }

            @Override
            public int returnChange() {
                return 0;
            }

            @Override
            public void presentProducts(ArrayList<Product> products) {

            }

            @Override
            public int getBalance() {
                return 0;
            }

            @Override
            public String[] getProduct() {
                return new String[0];
            }
        };
       //vendingMachine.presentProducts();
    }
}
