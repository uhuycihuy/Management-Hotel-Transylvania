package hotelmanagement.model;

import java.io.Serializable;

public class Makanan implements Serializable {
    private int itemNo;
    private int quantity;
    private double price;

    public Makanan(int itemNo, int quantity) {
        this.itemNo = itemNo;
        this.quantity = quantity;
        switch (itemNo) {
            case 1 -> price = quantity * 50;
            case 2 -> price = quantity * 60;
            case 3 -> price = quantity * 70;
            case 4 -> price = quantity * 30;
            default -> price = 0;
        }
    }

    public int getItemNo() {
        return itemNo;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Makanan [itemNo=" + itemNo + ", quantity=" + quantity + ", price=" + price + "]";
    }
}
