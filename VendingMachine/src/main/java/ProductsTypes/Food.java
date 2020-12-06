package ProductsTypes;

public class Food extends Product {
    int calories;

    public Food(java.lang.String name, int price, int calories) {
        super(name, price);
        this.calories = calories;
    }



    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    Product purchase(int money) {
        if (money >= getPrice()) {
            money = money - getPrice();
            return new Food(getName(), getPrice(), getCalories());
        } else {
            System.out.println("You don't have Suffienct money");
            return null;
        }
    }

    @Override
    String examine() {
        String priceString =Integer.toString(getPrice());
        String productInfo = "Price of product =" + priceString + " name = " + getName() + " Sugar percent = " + getCalories();
        return productInfo;
    }

    @Override
    void use() {
        System.out.println("Product has been used");
    }
}
