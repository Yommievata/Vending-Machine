package ProductsTypes;

public class Snack extends Product {
    int sugarPercent;


    public Snack(String name, int price, int sugarPercent) {
        super(name, price);
        this.sugarPercent = sugarPercent;
    }

    @Override
    Product purchase(int money) {
        if (money >= getPrice()){
            money = money - getPrice();
            return  new Snack(getName(),getPrice(),getSugarPercent());
        } else {
            System.out.println("You don't have Sufficient Money");
            return null;
        }
    }

    @Override
    String examine() {
        String priceString =Integer.toString(getPrice());
        String productInfo = "Price of product =" + priceString + " name = " + getName() + " Sugar percent = " + getSugarPercent();
        return productInfo;
    }

    @Override
    void use() {
        System.out.println("Product has been used");
    }

    public int getSugarPercent() {
        return sugarPercent;
    }

    public void setSugarPercent(int sugarPercent) {
        this.sugarPercent = sugarPercent;
    }
}
