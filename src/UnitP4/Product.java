package UnitP4;

import java.util.Objects;

public class Product {
    //Attribute id, a price, a category (clothing, electronics, etc)

    private int id;
    private double price;
    private String category;

    public Product(int id, double price, String category) {
        this.id = id;
        this.price = price;
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return id == product.id && Double.compare(price, product.price) == 0 && Objects.equals(category, product.category);
    }



    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
