package hotelmanagement.model;

import java.io.Serializable;

public class Makanan implements Serializable {
    private int itemNo;
    private int quantity;
    private float price;

    public Makanan(int itemNo, int quantity) {
        this.itemNo = itemNo;
        this.quantity = quantity;
        switch (itemNo) {
            case 1 -> price = quantity * 50;
            case 2 -> price = quantity * 60;
            case 3 -> price = quantity * 70;
            case 4 -> price = quantity * 30;
        }
    }

    public float getPrice() {
        return price;
    }

    public int getItemNo() {
        return itemNo;
    }

    public int getQuantity() {
        return quantity;
    }
}