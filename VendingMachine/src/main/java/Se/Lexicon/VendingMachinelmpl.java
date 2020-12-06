package Se.Lexicon;

import ProductsTypes.Drink;
import ProductsTypes.Food;
import ProductsTypes.Product;
import ProductsTypes.Snack;

import java.util.ArrayList;

public class VendingMachinelmpl implements VendingMachine {
    ArrayList<Product> products = new ArrayList<>();
    ArrayList<Integer> denominations = new ArrayList<>();
    int moneyPool;

    Drink water = new Drink("StillWater", 10, "25cl");
    Snack doughnut = new Snack("ChocolateDoughnut", 30, 30);
    Food salad = new Food("CheeseSalad", 35, 15);

    public VendingMachinelmpl(){
        denominations.add(1);
        denominations.add(2);
        denominations.add(5);
        denominations.add(10);
        denominations.add(20);
        denominations.add(50);
        denominations.add(100);
        denominations.add(200);
        denominations.add(500);
        denominations.add(1000);

        products.add(water);
        products.add(doughnut);
        products.add(salad);
        presentProducts(products);

        this.moneyPool = 0;
    }



    @Override
    public boolean addMoney(int money) {
        if (denominations.contains(money)) {
            moneyPool += money;
        } else {
            System.out.println("Denomination isn't available");
        }
            System.out.println("Your Moneypool is " + moneyPool);
        return false;
    }

    @Override
    public Product buy(int money, int prodNum) {
        int productPrice = products.get(prodNum).getPrice();
        if (moneyPool >= productPrice){
            moneyPool -= productPrice;
            System.out.println("Your moneypool is " + moneyPool);
            return products.get(prodNum);
                } else{
            System.out.println("You don't have suffient Money");
            }
        return null;
    }

    @Override
    public int returnChange() {
        int change = moneyPool;
        moneyPool= change;
        System.out.println("Your change is " + change);
        return change;
    }

    @Override
    public void presentProducts(ArrayList<Product> products) {
     for (int i=0; i<products.size(); i++)
         System.out.println("Product Number is " + products.get(i).getName());
    }

    @Override
    public int getBalance() {
        return moneyPool;
    }

    @Override
    public String[] getProduct() {
        return new String[0];
    }

    }


