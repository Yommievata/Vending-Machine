package ProductsTypes;

public class Drink extends Product {
    private String volume;

    public Drink(java.lang.String name, int price, String Volume) {
        super(name, price);
        this.volume = volume;
    }

    @Override
    Product purchase(int money) {
        if (money >= getPrice()) {
            money = money - getPrice();
            return new Drink(getName(), getPrice(), getVolume());
        } else {
            System.out.println("You don't have Suffienct money");
            return null;
        }
    }

    @Override
    String examine() {
        String priceString =Integer.toString(getPrice());
        String productInfo = "Price of product =" + priceString + " name = " + getName() + " Sugar percent = " + getVolume();
        return productInfo;
    }

    @Override
    void use() {
        System.out.println("Product has been used");
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
}
