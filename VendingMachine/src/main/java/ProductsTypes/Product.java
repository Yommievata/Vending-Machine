package ProductsTypes;

public  abstract class Product {
    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;

    }


    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    abstract Product purchase (int money);

    abstract java.lang.String examine();

    abstract void use();


}
