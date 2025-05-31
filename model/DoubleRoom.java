package hotelmanagement.model;

import java.io.Serializable;

public class DoubleRoom extends AbstractRoom implements Serializable {
    private double rate;

    public DoubleRoom(int roomNumber, double rate) {
        super(roomNumber);
        this.rate = rate;
    }

    @Override
    public double getRate() {
        return rate;
    }

    @Override
    public void checkIn(Customer... customers) {
        if (customers.length != 2) {
            throw new IllegalArgumentException("Double Room hanya untuk 2 orang");
        }
        for (Customer customer : customers) {
            if (customer == null) {
                throw new IllegalArgumentException("Data pelanggan tidak boleh kosong.");
            }
            this.customers.add(customer);
        }
        this.available = false;
    }

    @Override
    public String toString() {
        return "DoubleRoom [roomNumber=" + roomNumber + ", rate=" + rate + ", available=" + available + ", customers=" + customers + "]";
    }
}
